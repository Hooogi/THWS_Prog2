package exam_prep.ex_1;

import java.util.ArrayList;

public class Umsatzrechner {

    public double calculateInTotal(ArrayList<Fahrzeug> fahrzeuge){
        double inTotal = 0;
        for(Fahrzeug fahrzeug : fahrzeuge){
            for(Fahrt fahrt : fahrzeug.Fahrtenbuch){
                inTotal += fahrzeug.calculate(fahrt);
            }
        }
        return inTotal;
    }

    public double calculateElectroInTotal(ArrayList<Fahrzeug> fahrzeuge){
        ArrayList<Fahrzeug> electro = new ArrayList<>();
        for(Fahrzeug fahrzeug : fahrzeuge){
            if(fahrzeug instanceof Elektrofahrzeug){
                electro.add(fahrzeug);
            }
        }
        return calculateInTotal(electro);
    }
}
