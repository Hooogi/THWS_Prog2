package lect_16.ex_4;

public class MenschImpl implements Mensch{

    @Override
    public Actions entscheide(Dangerzone danger) {
        int random = (int)(Math.random()*4)+1;
        if(random == 1){
            return Actions.UNENTSCHIEDEN;
        }
        else{
            return danger.action;
        }
    }
}

