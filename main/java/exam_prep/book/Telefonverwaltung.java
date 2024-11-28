package exam_prep.book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Telefonverwaltung {

    ArrayList<Telefon> telefonlist;

    public void einfuegen(Telefon telefon){
        telefonlist.add(telefon);
    }

    public void sortiere(){
        Collections.sort(telefonlist);
        for(Telefon tel : telefonlist){
            System.out.println(tel);
        }
    }
}
