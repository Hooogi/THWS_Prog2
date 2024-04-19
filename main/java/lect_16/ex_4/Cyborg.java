package lect_16.ex_4;

public class Cyborg implements Mensch, Roboter{

    MenschImpl Ins_Mensch;
    RoboterImpl Ins_Roboter;

    public Cyborg(){
        this.Ins_Mensch = new MenschImpl();
        this.Ins_Roboter = new RoboterImpl();
    }
    @Override
    public Actions entscheide(Dangerzone danger) {
        Actions[] arr_Actions = new Actions[2];
        arr_Actions[0] = Ins_Mensch.entscheide(danger);
        arr_Actions[1] = Ins_Roboter.entscheide(danger);
        if(arr_Actions[0].name().equals(arr_Actions[1].name())){
            return arr_Actions[0];
        }
        else{
            int random = (int)(Math.random()*2);
            return arr_Actions[random];
        }
    }
}
