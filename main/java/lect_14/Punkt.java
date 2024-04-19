package lect_14;

public class Punkt
{
    int x;
    int y;

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void verschiebePunkt(int zielX, int zielY) {
        if(zielX<0 || zielY<0) throw new RuntimeException("input less than zero");
        else if(zielX>1920) throw new RuntimeException("x greater than 1920");
        else if(zielY>1080) throw new RuntimeException("y greater than 1080");

        x = zielX;
        y = zielY;
    }
}
