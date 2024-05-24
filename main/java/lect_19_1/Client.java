package lect_19_1;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(Socket connection = new Socket("localhost", 6969);
            OutputStream osClient = connection.getOutputStream();
            ObjectOutputStream Oos = new ObjectOutputStream(osClient);
            InputStream isClient = connection.getInputStream();
            ObjectInputStream Ios = new ObjectInputStream(isClient);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        ){
            hint firsthint = (hint) Ios.readObject();
            System.out.println(firsthint.hiddenword);
            do{
                String input = consoleReader.readLine();
                if(input.length() >1){
                    Oos.writeObject(new guess(input));
                }
                else{
                    Oos.writeObject(new guess(input.charAt(0)));
                }
                hint serverhint = (hint) Ios.readObject();
                System.out.println(serverhint.hiddenword);
                if(serverhint.gamewon){
                    System.out.println("Player won the game!");
                    break;
                }
                else if(serverhint.gameover){
                    System.out.println("Player lost the game!");
                    break;
                }
                else{
                    System.out.println("char in word: "+serverhint.charInWord);
                }
            }
            while(true);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
