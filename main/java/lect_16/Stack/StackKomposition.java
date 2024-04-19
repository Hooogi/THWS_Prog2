package lect_16.Stack;

import java.util.ArrayList;
public class StackKomposition implements Stack{
    ArrayList list;

    public StackKomposition(){
        this.list = new ArrayList();
    }

    public Object pop(){
        return this.list.remove(list.size()-1);
    }

    public void push(Object obj){
        this.list.add(obj);
    }
}
