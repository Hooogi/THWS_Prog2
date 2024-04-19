package lect_16.ex_4;

public class RoboterImpl implements Roboter{

    public Actions entscheide(Dangerzone danger){
        return danger.action;
    }
}
