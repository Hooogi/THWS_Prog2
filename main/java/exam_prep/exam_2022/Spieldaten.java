package exam_prep.exam_2022;

import java.util.ArrayList;
import java.util.List;

public class Spieldaten {

    double geld;
    GenerischeListe<String> SpielerID;

    private Spieldaten(double geld, List<String> SpielerID){
        this.geld = geld;
        this.SpielerID = new GenerischeListe<>(SpielerID);
    }

    public static class SpieldatenBuilder{

        private double geldBuilder;
        private ArrayList<String> SpielerIDBuilder = new ArrayList<>();

        public SpieldatenBuilder geld(double geld){
            this.geldBuilder = geld;
            return this;
        }

        public SpieldatenBuilder add(String spieler){
            this.SpielerIDBuilder .add(spieler);
            return this;
        }

        public Spieldaten build(){
            return new Spieldaten(geldBuilder, SpielerIDBuilder);
        }

    }
}
