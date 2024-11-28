package lect_22_3;

import lect_18_4.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TCPServer {

//    ArrayList<ServerThread> connections = new ArrayList<>();

    private static class ServerThread extends Thread{
        Socket socket;
        ArrayList<Integer> message;
        HashMap<Integer,Boolean> response = new HashMap<>();

        ServerThread(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run(){
            try(ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(socket.getInputStream())){
                message = (ArrayList<Integer>) is.readObject();
                for(int num : message){
                    response.put(num,isPrim(num));
                }
                os.writeObject(response);
                socket.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        //ArrayList<ServerThread> connections = new ArrayList<>();
        try(ServerSocket serverSocket = new ServerSocket(6969);){
            while(true){
                Socket connection = serverSocket.accept();
                ServerThread serverThread = new ServerThread(connection);
                //connections.add(st);
                serverThread.start();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public static boolean isPrim(int number) {
        if (number < 2) return false;
        for (int divisor = 2; divisor < number; divisor++)
            if (number % divisor == 0) return false;
        return true;
    }
}
