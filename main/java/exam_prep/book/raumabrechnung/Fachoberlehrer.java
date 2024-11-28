package exam_prep.book.raumabrechnung;

public class Fachoberlehrer extends Dozent implements MonatsweiseAbrechenbar{

    final int gehalt = 5000;

    @Override
    public int getFestgehalt() {
        return this.gehalt;
    }
}
