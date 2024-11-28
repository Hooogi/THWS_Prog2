package exam_prep.book.raumabrechnung;

public class Lehrbeauftragter extends Dozent implements StudenweiseAbrechenbar{

    final int payperhour = 20;
    int geleisteteStunden;

    @Override
    public int getAnzahlStunden() {
        return this.geleisteteStunden;
    }

    @Override
    public int getEuroProStunde() {
        return this.payperhour;
    }
}
