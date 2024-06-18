package exam_prep.ex_2;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    private String username;
    private String password;

    ArrayList<Message> messages = new ArrayList<>();
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

}
