package lect_17;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler {

    OutputStream os_one;
    OutputStream os_two;

    public OutputStreamDoubler(OutputStream os_one, OutputStream os_two){
        this.os_one = os_one;
        this.os_two = os_two;
    }

    public void close() throws IOException {
        try{
            os_one.close();
        }
        catch(IOException e){
            throw new IOException("os_one not closable");
        }
        try{
            os_two.close();
        }
        catch(IOException e){
            throw new IOException("os_two not closable");
        }
    }

    public void write(int b) throws IOException{
        try{
            os_one.write(b);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            os_two.write(b);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String data = "lupus est homo homini, non homo, quom qualis sit non novit.";
    }
}
