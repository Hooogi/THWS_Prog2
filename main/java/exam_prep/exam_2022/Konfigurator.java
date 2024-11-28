package exam_prep.exam_2022;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Konfigurator {

    public static List<String> liesKonfigurationsdatei() throws IOException{
        return null;
    }

    public static HashMap<String, String> convertConfig(){
        HashMap<String, String> convertedConfig = new HashMap<>();
        List<String> config = new ArrayList<>();
        try{
            config = liesKonfigurationsdatei();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        for(String line : config){
            int seperator = line.indexOf('=');
            convertedConfig.put(line.substring(0,seperator),line.substring(seperator+1,line.length()+1));
        }
        return convertedConfig;
    }
}
