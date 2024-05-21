package lect_18_2;

import java.io.*;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {
        try(Socket connection = new Socket("localhost", 6969);
            OutputStream osClient = connection.getOutputStream();
            BufferedWriter bufferedClientWriter = new BufferedWriter(new OutputStreamWriter(osClient));
            InputStream isClient = connection.getInputStream();
            BufferedReader bufferedClientReader = new BufferedReader(new InputStreamReader(isClient));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            ){
            if(connection.isConnected()) {
                System.out.println("Connection accepted. Waiting for server.");
            }
            //Connection to Server - 1st Server Message
            String serverMessage = bufferedClientReader.readLine();
            System.out.println(serverMessage);

            do{
                String clientMessage = consoleReader.readLine();
                if(clientMessage.equals("end")) break;
                bufferedClientWriter.write(clientMessage+"\n");
                bufferedClientWriter.flush();
                serverMessage = bufferedClientReader.readLine();
                System.out.println(serverMessage);
                if(serverMessage.equals("You Won!") || serverMessage.equals("Game Over!")){
                    break;
                }
            }
            while(true);

            System.out.println("Client beendet.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }



}