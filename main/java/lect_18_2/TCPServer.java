package lect_18_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class TCPServer {

    public static void main(String[] args) {

        String[] words = {"Hochschule","Fakultaet","Programmieren","Java"};
        int random = (int) (Math.random()* words.length);
        String word = words[random];
        String hiddenWord = convertString(word);
        int attempts = 10;

        try(ServerSocket ss = new ServerSocket(6969);
            Socket connection = ss.accept();
            InputStream inputStreamServer = connection.getInputStream();
            BufferedReader bufferedServerReader = new BufferedReader(new InputStreamReader(inputStreamServer));
            OutputStream osServer = connection.getOutputStream();
            BufferedWriter bufferedServerWriter = new BufferedWriter(new OutputStreamWriter(osServer)))
        {
            //First Message to Client to confirm connection
            bufferedServerWriter.write("Connection established. Your Word is: "+hiddenWord+" - Good Luck!\n");
            bufferedServerWriter.flush();

            do{
                String clientMessage = bufferedServerReader.readLine();
                if(clientMessage == null) break;
                else if(checkForChar(word, clientMessage.charAt(0))){
                    hiddenWord = replaceUnderscore(word, hiddenWord, clientMessage.charAt(0));
                }
                else{
                    attempts--;
                }

                if(attempts == 0){
                    bufferedServerWriter.write("Game Over!\n");
                    break;
                }
                else if(hiddenWord.equals(word)){
                    bufferedServerWriter.write("You Won!\n");
                    break;
                }
                System.out.println(clientMessage);
                bufferedServerWriter.write(hiddenWord+" - remaining attempts: "+ attempts+"\n");
                bufferedServerWriter.flush();
            }
            while(true);

            //Closing Server-Socket
            System.out.println("Server beendet.");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public static String convertString(String word){
        String hiddenString = "";
        for(char c : word.toCharArray()){
            hiddenString += "_";
        }
        return hiddenString;
    }

    public static String replaceUnderscore(String word, String hiddenword, char c){
        char[] arWord = word.toCharArray();
        char[] arHiddenWord = hiddenword.toCharArray();

        for(int i=0; i<arWord.length; i++){
            if(arWord[i] == c){
                arHiddenWord[i] = c;
            }
        }
        return String.valueOf(arHiddenWord);
    }

    public static boolean checkForChar(String word, char c){
        char[] arWord = word.toCharArray();
        boolean found = false;
        for(char a : arWord){
            if(a == c){
                found = true;
                break;
            }
        }
        return found;
    }
}
