package lect_19_1;

import java.io.Serializable;

public class hint implements Serializable {

    String hiddenword;
    boolean gamewon;
    boolean gameover;
    boolean charInWord;


    public hint(String hiddenword,boolean gamewon, boolean gameover, boolean charInWord){
        this.hiddenword = hiddenword;
        this.gameover = gameover;
        this.gamewon = gamewon;
        this.charInWord = charInWord;
    }
    public hint(String word){
        this.hiddenword = word;
        this.gamewon = true;
    }
}
