package lect_14;

public class Strecke {

    int start;
    int end;

    public Strecke(int start, int end){
        if(start < 0 || end < 0) throw new RuntimeException("parameter must be a positive integer");
        else if(end < start){
            this.start = end;
            this.end = start;
        }
        else{
            this.start = start;
            this.end = end;
        }
    }

    public static boolean overlap(Strecke first, Strecke second){
        if(second.start < first.end && first.end < second.end){
            return true;
        }
        else if(second.start < first.start && first.start < second.end){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString(){
        if(this.start == this.end){
            return String.valueOf(this.start);
        }
        else{
            String stringStrecke = String.valueOf(this.start);
            for(int i = 0; i<this.end-this.start; i++){
                stringStrecke += '-';
            }
            stringStrecke += String.valueOf(this.end);
            return stringStrecke;
        }
    }
}
