package exam_prep.ex_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ibanCheck {

    public static boolean ibanCheck(String iban) throws FalscheIBANException{
        if(iban.length()>22){
            throw new FalscheIBANException("IBAN ist ungültig, da sie die maximale Länge überschreitet! \n IBAN: "+ iban);
        }
        else if(iban.charAt(0) != 'D' || iban.charAt(1) != 'E'){
            throw new FalscheIBANException("Es handelt sich um keine deutsche IBAN! IBAN: "+ iban);
        }
        return true;
    }

    public static void ibanAusDateiLesen(String filename) throws FalscheIBANException{
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            while(true){
                String iban = br.readLine();
                if(iban == null) break;
                else{
                    ibanCheck(iban);
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Datei: "+ filename +" nicht gefunden");
        }
        catch(IOException e){
            System.out.println("Fehler beim Lesevorgang von Datei: "+filename);
        }
        catch(NullPointerException e){
            System.out.println("Datei: "+filename + " existiert nicht.");
        }
    }

    public void dateienTest(String[] dateien){
        for(String s : dateien){
            try{
                ibanAusDateiLesen(s);
            }
            catch(FalscheIBANException e){
                System.out.println(s);
            }
        }
    }

}
