package lect_15;

public class Angestellter extends Mitarbeiter{

    public Angestellter(String name, String vorname, int id, double payment, String birthdate){
        super(name, vorname, id, payment, birthdate);
        this.payment_factor = 1;
    }

}
