package exam_prep.book.raumabrechnung;

public class Raum{

    Dozent dozent;
    public <E extends Dozent> void betrete(E dozent){
        if(this.dozent == null){
            this.dozent = dozent;
        }
        else{
            throw new RuntimeException();
        }
    }
}
