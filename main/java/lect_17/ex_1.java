package lect_17;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //NumberformatException
        try{
            String inputString = input.nextLine();
            int x = Integer.valueOf(inputString);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }


        //ArrayOutOfBoundException
        try{
            int[] intArray = new int[5];
            for(int i = 0; i<6; i++){
                intArray[i] = i;
            }
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }


        //NullPointerException
        try{
            String s = null;
            s.length();
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }


        //OutOfMemoryException
        try{
            List<byte[]> list = new ArrayList<>();
            while(true){
                byte[] b = new byte[1048576];
                list.add(b);
            }
        }
        catch(Error e){
            System.out.println(e.getClass());
        }

        //FileNotFoundException
        try{
             InputStream fis = new FileInputStream("pic.jpg");
        }
        catch(Exception e){
            System.out.println(e.getClass());

        }

        //ArithmeticException
        try{
            int x = 0;
            int y = 3;
            int z = y/x;
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }

    }


}
