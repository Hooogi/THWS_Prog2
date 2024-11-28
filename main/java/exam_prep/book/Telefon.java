package exam_prep.book;

public class Telefon implements Comparable<Telefon>{

    double preis;
    String farbe;
    boolean schnurlos;

    public Telefon(double preis, String farbe, boolean schnurlos){
        this.preis = preis;
        this.farbe = farbe;
        this.schnurlos = schnurlos;
    }

    @Override
    public int compareTo(Telefon o) {
        if(this.preis > o.preis){
            return 1;
        }
        else if(this.preis < o.preis){
            return -1;
        }
        else{
            return 0;
        }
    }
}
