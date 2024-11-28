package exam_prep.Fahrten;

import java.util.List;

public class Umsetzberechner {

    public double berechneGesamtumsatz(List<? extends Fahrzeug> Fuhrpark){
        double out = 0;
        for(Fahrzeug car : Fuhrpark){
            for(Fahrt fahrt : car.Fahrtenbuch){
                out += car.calculate(fahrt);
            }
        }   
        return out;
    }
}
