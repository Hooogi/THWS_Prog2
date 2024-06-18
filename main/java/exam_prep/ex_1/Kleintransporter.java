package exam_prep.ex_1;

public class Kleintransporter extends Fahrzeug{

    final double satz = 30.0;
    @Override
    public double calculate(Fahrt fahrt) {
        if(fahrt.min<60){
            return fahrt.km * satz;
        }
        else{
            return 1800+((fahrt.min-60)*25)+(fahrt.km*30);
        }
    }

    @Override
    public void add(Fahrt fahrt) {
        this.Fahrtenbuch.add(fahrt);
    }
}
