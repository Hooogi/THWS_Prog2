package exam_prep.ex_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MusikStueckSammlung {

    HashMap<String, MusikStueck> Sammlung = new HashMap<>();

    public void musikStueckEinfuegen(MusikStueck neu) throws IllegalArgumentException{
        if(Sammlung.containsKey(neu.titel)){
            throw new IllegalArgumentException("Titel bereits in der Sammlung!");
        }
        else{
            Sammlung.put(neu.titel, neu);
        }
    }

    public MusikStueck[] getAlleMusikStueckeNachTitel(){
        ArrayList<MusikStueck> stuecke = new ArrayList<>(Sammlung.values());
        stuecke.sort(new VergleicheMusikStueckTitel());
        MusikStueck[] array = new MusikStueck[stuecke.size()];
        return stuecke.toArray(array);
    }

    public List<MusikStueck> getMusikStueckeNachLaenge(){
        ArrayList<MusikStueck> out = new ArrayList<>(Sammlung.values());
        out.sort((stueck1, stueck2) -> stueck2.laenge > stueck1.laenge ? -1 :
                stueck1.laenge == stueck2.laenge ? 0 : 1);
        return out;
    }


}
