package exam_prep.ex_1;

public class Motorroller extends Fahrzeug{

    final double satz = 15.0;
    @Override
    public double calculate(Fahrt fahrt) {
        return 3 + fahrt.km*15.0;
    }

    @Override
    public void add(Fahrt fahrt) {
        this.Fahrtenbuch.add(fahrt);
    }
}
