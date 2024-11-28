package exam_prep.zusatz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Vigenere implements Serializable {

    HashMap<String, ArrayList<String>> quadrat = new HashMap<>();

    public Vigenere(){
        for(Letters letter : Letters.values()){
            ArrayList<String> list = new ArrayList<>();
            Arrays.stream(Letters.values()).filter(n -> !n.equals(letter)).forEach(let -> list.add(let.name()));
            quadrat.put(letter.name(), list);
        }
        quadrat.keySet().stream().filter(key -> !key.equals("A")).forEach(key -> Collections.shuffle(quadrat.get(key)));
    }

    public void createFile(){
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("geheimnis.oos"))){
            os.writeObject(this);
            os.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Vigenere vig = new Vigenere();
        vig.createFile();
    }
}
