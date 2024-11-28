package exam_prep.self_morse;

import java.util.HashMap;

public class MorseTranslator {

    HashMap<String, String> table = new HashMap<>();

    public MorseTranslator(){
        for(Morse morse : Morse.values()){
            table.put(morse.name(), morse.code);
        }
    }

    public static void main(String[] args) {
        MorseTranslator translator = new MorseTranslator();

        for(String s : translator.table.keySet()){
            System.out.println(s + " : "+ translator.table.get(s));
        }
    }
}
