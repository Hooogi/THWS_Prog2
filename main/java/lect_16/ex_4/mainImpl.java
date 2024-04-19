package lect_16.ex_4;

import java.sql.SQLOutput;

public class mainImpl {

    public static void main(String[] args) {

        MenschImpl Lukas = new MenschImpl();

        RoboterImpl Codsworth = new RoboterImpl();

        Cyborg Adam_Smasher = new Cyborg();

        for(int i = 0; i<10; i++){

            Dangerzone[] danger = Dangerzone.values();
            System.out.println("Gefahr: "+danger[i%3]);
            System.out.println("---------------");
            System.out.println("Mensch: "+Lukas.entscheide(danger[i%3]));
            System.out.println("Roboter: "+Codsworth.entscheide(danger[i%3]));
            System.out.println("Cyborg: "+Adam_Smasher.entscheide(danger[i%3])+"\n");
        }
    }
}
