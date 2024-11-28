package exam_prep.book.raumabrechnung;

public class Professor extends Dozent implements MonatsweiseAbrechenbar{

    final int gehalt = 10000;

    @Override
    public int getFestgehalt() {
        return this.gehalt;
    }
}
