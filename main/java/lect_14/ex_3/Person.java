package lect_14.ex_3;

public class Person {

    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, Adresse adressse){
        if (!(vorname.charAt(0) >= 'A' && vorname.charAt(0) <= 'Z')) throw new RuntimeException("invalid firstname");
        else{
            this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = adressse;
        }
    }
}
