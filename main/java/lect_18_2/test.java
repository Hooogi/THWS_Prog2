package lect_18_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {
    public static void main(String[] args) {
//        try(BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))){
//            String message = consoleReader.readLine();
//            if(message.equals("END")){
//                System.out.println("null");
//            }
//            else System.out.println(message);
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }

        String word = "Hallo";
        String hiddenword = TCPServer.convertString(word);

        System.out.println(TCPServer.checkForChar(word, 's'));

    }
}
