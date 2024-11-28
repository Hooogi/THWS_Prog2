package exam_prep.Fahrten;

import java.util.ArrayList;

public abstract class Fahrzeug {

    double Satz;
    ArrayList<Fahrt> Fahrtenbuch = new ArrayList<>();

    public abstract double calculate(Fahrt fahrt);

    public abstract void addtoFB(Fahrt fahrt);
}
