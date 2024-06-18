package exam_prep.ex_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User>{

    @Override
    public List<User> deserialize() throws RuntimeException{
        List<User> userlist = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))){
            while(true){
                try{
                    User user = (User) ois.readObject();
                    userlist.add(user);

                }
                catch(EOFException e){
                    break;
                }
            }
        }
        catch(Exception e){
            throw new RuntimeException("Fehler bei der Deserialisierung!");
        }
        return userlist;
    }

    @Override
    public void serialize(List<User> userlist) throws RuntimeException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))){
            for(User user : userlist){
                oos.writeObject(user);
                oos.flush();
            }
        }
        catch(Exception e){
            throw new RuntimeException("Fehler bei der Serialisierung");
        }
    }
}
