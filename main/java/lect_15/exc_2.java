package lect_15;

public class exc_2 {
    public static void main(String[] args) {
        Person[] personal = new Person[100];
        boolean student = false;
        for(int i = 0; i< personal.length; i++){
            if(student){
                personal[i] = new Student("Programmieren");
            }
            else{
                personal[i] = new Professor("Programmieren");
            }
            student = !(student);
        }

        for(int i = 0; i< personal.length; i++){
            System.out.println(personal[i].gibTaetigkeitAus());
        }
    }
}
