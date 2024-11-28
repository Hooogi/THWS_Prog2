package exam_prep.ex_4;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {
    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        if(o1.titel.compareTo(o2.titel) > 0){
            return 1;
        }
        else if(o1.titel.compareTo(o2.titel) == 0){
            return 0;
        }
        else{
            return -1;
        }
    }
}
