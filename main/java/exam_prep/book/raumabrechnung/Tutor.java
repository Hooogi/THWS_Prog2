package exam_prep.book.raumabrechnung;

public class Tutor extends Dozent implements StudenweiseAbrechenbar{

    final int payperhour = 14;
    int geleisteStunden;

    @Override
    public int getEuroProStunde() {
        return this.payperhour;
    }

    @Override
    public int getAnzahlStunden() {
        return this.geleisteStunden;
    }
}
