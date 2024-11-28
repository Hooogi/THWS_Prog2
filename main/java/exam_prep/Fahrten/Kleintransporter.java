package exam_prep.Fahrten;

public class Kleintransporter extends Fahrzeug{

    final double Satz = 30.0;
    @Override
    public double calculate(Fahrt fahrt) {
        if(fahrt.min<=60){
            return Satz* fahrt.km;
        }
        else{
            return Satz*fahrt.km + (fahrt.min-60)*25.0;
        }
    }

    @Override
    public void addtoFB(Fahrt fahrt) {
        this.Fahrtenbuch.add(fahrt);
    }
}
