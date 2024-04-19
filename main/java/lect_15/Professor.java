package lect_15;

public class Professor extends Person{

    public Professor(String Fach){
        this.Fach = Fach;
    }
    @Override
    public String gibTaetigkeitAus() {
        return "Der Professor unterrichtet "+this.Fach;
    }
}
