package lect_14.ex_3;

public class Adresse {
    String strasse;
    String hausnummer;
    int postleitzahl;
    String Ort;

    public Adresse(String strasse, String hausnummer, int postleitzahl, String Ort) {
        if (!(strasse.charAt(0) >= 'A' && strasse.charAt(0) <= 'Z')) throw new RuntimeException("invalid streetname");
        else if (!(Ort.charAt(0) >= 'A' && Ort.charAt(0) <= 'Z')) throw new RuntimeException("invalid cityname");
        else if (!(hausnummer.charAt(0) >= '1' && hausnummer.charAt(0) <= '9')) throw new RuntimeException("invalid number");
        else {
            this.strasse = strasse;
            this.hausnummer = hausnummer;
            this.postleitzahl = postleitzahl;
            this.Ort = Ort;
        }
    }
}

