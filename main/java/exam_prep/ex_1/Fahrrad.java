package exam_prep.ex_1;

public class Fahrrad extends Fahrzeug{

    final double satz = 12.5;
    @Override
    public double calculate(Fahrt fahrt) {
        return fahrt.min * satz;
    }

    @Override
    public void add(Fahrt fahrt) {
        this.Fahrtenbuch.add(fahrt);
    }
}
