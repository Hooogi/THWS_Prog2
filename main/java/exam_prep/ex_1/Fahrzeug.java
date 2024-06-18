package exam_prep.ex_1;

import java.util.ArrayList;

public abstract class Fahrzeug {

    double satz;

    ArrayList<Fahrt> Fahrtenbuch = new ArrayList<>();

    public abstract double calculate(Fahrt fahrt);

    public abstract void add(Fahrt fahrt);
}
