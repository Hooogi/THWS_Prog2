package exam_prep.exam_2022;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer {

    //a)
    protected static void writeToClient(BufferedWriter toClient, String s) throws IOException {
        toClient.write(s);
        toClient.newLine();
        toClient.flush();
    }

    //b)
    public void start() throws IOException
    {
        try (ServerSocket ss = new ServerSocket(5000);)
        {
            while(true){
                try(Socket connection = ss.accept();)
                {
                    handleConnection(connection);
                }
                catch(IOException e){

                }
            }
        }
    }

    private void handleConnection(Socket connection) throws IOException
    {

    }
}
