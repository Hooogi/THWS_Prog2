package lect_22_3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class TCPClient{

    public static class ClientThread extends Thread{
        String host;
        int port;
        ArrayList<Integer> numbers;
        HashMap<Integer,Boolean> response = new HashMap<>();

        public ClientThread(String host, int port, ArrayList<Integer> numbers){
            this.host =host;
            this.port = port;
            this.numbers = numbers;
        }

        @Override
        public void run(){
            try(Socket connection = new Socket(host, port);
                ObjectOutputStream os = new ObjectOutputStream(connection.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(connection.getInputStream())){
                os.writeObject(numbers);
                response = (HashMap<Integer, Boolean>) is.readObject();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        for(int i = 0; i<2; i++){
            numbers.add(new ArrayList<Integer>());
            for (int j = 0; j < 100; j++) {
                numbers.get(i).add((int) (Math.random() * 1000) + 1);
            }
        }

        ClientThread client1 = new ClientThread("localhost",6969,numbers.get(0));
        client1.start();
        ClientThread client2 = new ClientThread("localhost",6969, numbers.get(1));
        client2.start();
        try{
            client1.join();
            client2.join();
            for(int num : client1.response.keySet()){
                System.out.println(num +" : "+client1.response.get(num));
            }
            for(int num : client2.response.keySet()){
                System.out.println(num +" : "+client2.response.get(num));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
