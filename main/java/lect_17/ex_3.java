package lect_17;

import java.io.*;
import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String filepath = scanner.nextLine();

        long[][] meassuredTime = new long[3][10];
        for(int i = 0; i< meassuredTime.length; i++){
            for(int j = 0; j<meassuredTime[i].length; j++){
                try(InputStream fis = initInputStream(filepath); OutputStream fos = new FileOutputStream("copyClap.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis); BufferedOutputStream bos = new BufferedOutputStream(fos)){
                    if(i == 0){
                        meassuredTime[0][j] = copyByByte(fis,fos);
                    }
                    else if(i == 1){
                        meassuredTime[1][j] = copyByByte(bis,bos);
                    }
                    else{
                        meassuredTime[2][j] = copyByBlock(fis,fos);
                    }
                    System.out.println((j+1)+(i*10) +" pass done.");
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        for(int j = 0; j < meassuredTime[0].length; j++){
            System.out.println(j+1);
            System.out.print("By byte  unpuffered: "+meassuredTime[0][j]);
            System.out.print(" - By byte  puffered: "+meassuredTime[1][j]);
            System.out.print(" - By block  unpuffered: "+meassuredTime[2][j]+ "\n");
        }
    }
    public static InputStream initInputStream(String path){
        Scanner input = new Scanner(System.in);

        boolean FileNotFound = false;
        InputStream fis = null;
        do{
            try{
                if(FileNotFound){
                    path = input.nextLine();
                }
                fis = new FileInputStream(path);
                FileNotFound = false;
            }
            catch(FileNotFoundException e){
                System.err.println(e.getMessage());
                FileNotFound = true;
            }
        }
        while(FileNotFound);
        if(fis != null){
            System.out.println("succcess");
        }
        input.close();
        return fis;
    }
    public static long copyByByte(InputStream fis, OutputStream fos) throws IOException{
        int b;
        long startTime = System.currentTimeMillis();
        do{
            b = fis.read();
            if(b!=-1) fos.write(b);
        }
        while(b!=-1);
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static long copyByBlock(InputStream fis, OutputStream fos) throws IOException{
        byte[] block =  new byte[1024];
        int n;

        long startTime = System.currentTimeMillis();

        do{
            n = fis.read(block);
            if(n!=-1) fos.write(block,0,n);
        }
        while(n != -1);
        long endTime = System.currentTimeMillis();

        return endTime-startTime;
    }


}
