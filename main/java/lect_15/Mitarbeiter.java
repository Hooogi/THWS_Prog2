package lect_15;

public abstract class Mitarbeiter {
    String name;
    String vorname;
    int id;
    double payment;
    double payment_factor;
    String birthdate;

    public Mitarbeiter(String name, String vorname, int id, double payment, String birthdate){
        this.name = name;
        this.vorname = vorname;
        this.id = id;
        this.payment = payment;
        this.birthdate = birthdate;
    }

    public double calculatePayment() {
        return this.payment * this.payment_factor;
    }
}
