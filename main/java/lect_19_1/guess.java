package lect_19_1;

import java.io.Serializable;

public class guess implements Serializable {

    String word;
    char letter;

    public guess(String word){
        this.word = word;
    }

    public guess(char letter){
        this.letter = letter;
    }
}
