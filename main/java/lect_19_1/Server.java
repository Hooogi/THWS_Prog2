package lect_19_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        String[] words = {"client","server","stream","output","input","serializable"};
        int random = (int) (Math.random()* words.length);
        String word = words[random];
        String hiddenword = convertString(word);
        int attempts = 10;

        try(ServerSocket ss = new ServerSocket(6969);
            Socket connection = ss.accept();
            OutputStream osServer = connection.getOutputStream();
            ObjectOutputStream Oos = new ObjectOutputStream(osServer);
            InputStream isServer = connection.getInputStream();
            ObjectInputStream Ois = new ObjectInputStream(isServer))
        {
            Oos.writeObject(new hint(hiddenword,false, false, false));
            do{
                guess clientGuess = (guess) Ois.readObject();
                if(clientGuess.word == null){
                    if(checkForChar(word,clientGuess.letter)){
                        hiddenword = replaceUnderscore(word, hiddenword, clientGuess.letter);
                        if(hiddenword.equals(word)){
                            Oos.writeObject(new hint(word));
                        }
                        else{
                            Oos.writeObject(new hint(hiddenword, false, false, true));
                        }
                    }
                    else{
                        attempts--;
                        if(attempts >0){
                            Oos.writeObject(new hint(hiddenword, false, false, false));
                        }
                        else {
                            Oos.writeObject(new hint(hiddenword,false, true, false));
                        }
                    }
                }
                else{
                    if(clientGuess.word.equals(word)){
                        System.out.println("player won the game");
                        Oos.writeObject(new hint(word));
                        break;
                    }
                    else{
                        attempts--;
                        if(attempts>0){
                            Oos.writeObject(new hint(hiddenword, false, false , false));
                        }
                        else{
                            Oos.writeObject(new hint(hiddenword, false, true , false));
                        }
                    }
                }
            }
            while(true);
        }
        catch(Exception e){
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
