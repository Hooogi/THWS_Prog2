package lect_15;

public class Abteilungsleiter extends Mitarbeiter{

    public Abteilungsleiter(String name, String vorname, int id, double payment, String birthdate){
        super(name, vorname, id, payment, birthdate);
        this.payment_factor = 2;
    }

    public void promote(Angestellter employee){
        employee.payment_factor += 0.10;
    }
}
