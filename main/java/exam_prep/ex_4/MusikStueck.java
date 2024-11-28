package exam_prep.ex_4;

public class MusikStueck
{
    String titel; // Name des Musikstueckes
    String interpret; // Gruppe/Saenger des Stueckes
    int laenge; // Dauer in Sekunden
    public MusikStueck(String titel, String interpret, int laenge)
    {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    @Override
    public String toString(){
        return this.interpret + " - " +this.titel + " - Dauer: "+this.laenge;
    }
}