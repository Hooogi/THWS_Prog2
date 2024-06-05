package lect_20_3;

import java.util.*;

public class Vokabeltrainer {
    Map<String, List<String>> english2German = new HashMap<>();

    public void addToDictionary(String word, List<String> list){
        english2German.put(word,list);
    }

    public void addToDictionary(String word, String germanWord){
        ArrayList<String> translations = new ArrayList<>();
        translations.add(germanWord);
        english2German.put(word,translations);
    }

    public static void main(String[] args) {
        Vokabeltrainer voc = new Vokabeltrainer();
        voc.addToDictionary("help", new ArrayList<String>(Arrays.asList("helfen","unterstüzen")));
        voc.addToDictionary("attend","teilnehmen");

        for(String key : voc.english2German.keySet()){
            System.out.println(key + " : "+ voc.english2German.get(key));
        }
    }
}

