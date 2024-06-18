package exam_prep.ex_2;

import java.lang.reflect.Array;
import java.security.MessageDigestSpi;
import java.util.ArrayList;
import java.util.List;

public class TwotterSystem {

    ArrayList<User> userlist = new ArrayList<>();

    public void addMessage(User user, Message message){
        user.messages.add(message);
    }

    public List<Message> getAllMessages(){
        List<Message> messages = new ArrayList<>();
        for(User user : userlist){
            messages.addAll(user.messages);
        }
        return messages;
    }

    public List<Message> getAllMessagesFromDate(String date){
        List<Message> messages = getAllMessages();
        for(Message message : messages){
            if(!(message.date.equals(date))){
                messages.remove(message);
            }
        }
        return messages;
    }

    public List<Message> getAllMessagesFromUser(User user){
        return user.messages;
    }
}
