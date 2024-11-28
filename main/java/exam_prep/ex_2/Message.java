package exam_prep.ex_2;

import java.util.Date;

public class Message {

    String message;
    String date;

    public Message(String message){
        if(message.length()<=140){
            this.message = message;
        }
        else{
            throw new RuntimeException("Message zu lang");
        }
    }
}
