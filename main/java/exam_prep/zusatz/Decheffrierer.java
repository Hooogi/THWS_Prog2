package exam_prep.zusatz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Decheffrierer {

    Vigenere vigenere;
    char[] codeword;
    public Decheffrierer(String codeword){
        this.codeword = codeword.toCharArray();
        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("geheimnis.oos"))){
            Vigenere vig = (Vigenere) is.readObject();
            if(vig != null){
                this.vigenere = vig;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
//
//    public String chiffre(String message){
//        char[] chiffre = new char[message.length()];
//        for(int i = 0; i<chiffre.length;i++){
//            chiffre[i] = codeword[i% codeword.length];
//        }
//
//    }

}
