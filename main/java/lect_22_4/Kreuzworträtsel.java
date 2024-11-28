package lect_22_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzworträtsel {

    public static class nestedStringComparator implements Comparator<String>{

        @Override
        public int compare(String s1, String s2) {
            if(s1.length()<s2.length()){
                return -1;
            }
            else if(s1.length()>s2.length()){
                return 1;
            }
            else{
                if(s1.compareTo(s2)<0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        }
    }
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args)
    {
        Comparator<String> comp2 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length()<s2.length()){
                    return -1;
                }
                else if(s1.length()>s2.length()){
                    return 1;
                }
                else{
                    if(s1.compareTo(s2)<0){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
            }
        };
        Comparator<String> comp3 = (s1,s2) -> {
                if(s1.length()<s2.length()){
                    return -1;
                }
                else if(s1.length()>s2.length()){
                    return 1;
                }
                else{
                    if(s1.compareTo(s2)<0){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
        };

        StringComparator comp = new StringComparator();
        TreeSet<String> t = new TreeSet<>(comp3);
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
}
