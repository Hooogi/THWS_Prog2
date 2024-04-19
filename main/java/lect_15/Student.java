package lect_15;

public class Student extends Person{

    public Student(String Fach){
        this.Fach = Fach;
    }

    @Override
    public String gibTaetigkeitAus() {
        return "Der Student besucht das Fach "+this.Fach;
    }
}
