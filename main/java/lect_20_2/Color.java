package lect_20_2;

public enum Color {

    Kreuz(1000),Pik(100),Herz(10),Raute(1);

    public final int value;
    Color(int value){
        this.value = value;
    }
}
