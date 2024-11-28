package exam_prep.ex_7;

import java.io.*;

public class Finder {
    public BufferedReader getSystemInAsBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
    public void findStringInFiles(String searchString, String[] filenames) {
        for(String s : filenames){
            int row = 0;
            try(BufferedReader br = new BufferedReader(new FileReader(s))) {
                do{
                    String line = br.readLine();
                    if(line == null) break;
                    if(line.contains(searchString)) {
                        System.out.println("String found in "+ s + " at line: "+row+1);
                    }
                    row++;
                }
                while(true);
            }
            catch(FileNotFoundException i){
                System.err.println("Die Datei konnte nicht geöffnet werden");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        }
        catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        }
    }
}