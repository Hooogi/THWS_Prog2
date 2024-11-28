package lect_22_4;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

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
