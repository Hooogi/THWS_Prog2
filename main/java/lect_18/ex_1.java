package lect_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ex_1 {

    public static void splitStudiengaenge(String filename) throws MatrikelNummerException{
        try(BufferedReader br = new BufferedReader(new FileReader(filename));
            BufferedWriter bwInf = new BufferedWriter(new FileWriter("InfNr.txt"));
            BufferedWriter bwWInf = new BufferedWriter(new FileWriter("WInfNr.txt"));
            BufferedWriter bwEC = new BufferedWriter(new FileWriter("ECNr.txt"))
        ){
            do{
                String line = br.readLine();
                if(line == null) break;
                else if(line.substring(0,2).equals("50")){
                    bwWInf.write(line);
                    bwWInf.newLine();
                }
                else if(line.substring(0,2).equals("51")){
                    bwInf.write(line);
                    bwInf.newLine();
                }
                else if(line.substring(0,2).equals("61")){
                    bwEC.write(line);
                    bwEC.newLine();
                }
                else{
                    throw new MatrikelNummerException(line + " is an invalid matrnr");
                }
            }
            while(true);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            splitStudiengaenge("MatrNr.txt");
        }
        catch(MatrikelNummerException e){
            e.getMessage();
        }
    }
}
