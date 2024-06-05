package lect_20_2;

public enum Value {

    Bube(1000),Ass(7),Zehn(6),Koenig(5),Dame(4),Neun(3),Acht(2),Sieben(1);
    public final int value;

    Value(int value){
        this.value = value;
    }
}
