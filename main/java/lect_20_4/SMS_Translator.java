package lect_20_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class SMS_Translator {

    Map<String,Integer> converter = new HashMap<>();

    public SMS_Translator(){
        this.converter = new HashMap<>();

        for(Letters letters : Letters.values()){
            converter.put(letters.name(), letters.number);
        }
    }

    public int getNumber(String s) throws IllegalTelephoneNumberException{
        try{
            return converter.get(s);
        }
        catch(Exception e){
            throw new IllegalTelephoneNumberException("invalid input");
        }
    }

    public void initTranslation(){
        try(BufferedReader br = new BufferedReader(new FileReader("Zeichenkontakte.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Nummernkontakte.txt")))
        {
            do{
                String line = br.readLine();
                if(line == null){
                    break;
                }
                for(char c : line.toCharArray()){
                    try{
                        int number = getNumber(String.valueOf(c));
                        bw.write(String.valueOf(number));
                    }
                    catch(IllegalTelephoneNumberException e){
                        System.out.println(c + " : "+ e.getMessage());
                    }
                }
                bw.newLine();
            }
            while(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SMS_Translator translator = new SMS_Translator();
        translator.initTranslation();
    }
}
