package exam_prep.ex_8;

import java.util.HashMap;

public class Morse {

    HashMap<String, String> morseAlphabet;
    public static String charToMorseCode(char c) {
        String morseCode = switch (c) {
            case 'A' -> ".-";
            case 'B' -> "−...";
            case 'C' -> "−.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "_._";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            default ->
                    throw new RuntimeException("Unexpected value: "+c);
        };
        return morseCode;
    }

    public HashMap<String, String> getMorseCodeMap(){
        HashMap<String, String> morseAlphabet = new HashMap<>();
        for(int i = (int) 'A'; i<= (int) 'Z'; i++){
            morseAlphabet.put(String.valueOf((char)i),charToMorseCode((char)i));
        }
        return morseAlphabet;
    }

    public Morse(){
        this.morseAlphabet = getMorseCodeMap();
    }

    public String zeichenketteToMorse(String s){
        String morse = "";
        for(char c : s.toCharArray()){
            morse += charToMorseCode(c) + " ";
        }
        return morse;
    }
}
