package exam_prep.book;

import java.util.ArrayDeque;
import java.util.Deque;

public class Zufallsverwaltung_pt2 {

    Deque<Double> returnedNumbers = new ArrayDeque<>();
    public double next(){
        double out;
        if(!returnedNumbers.isEmpty()){
            out = returnedNumbers.pop();
        }
        else{
            out = Math.random();
        }
        returnedNumbers.push(out);
        return out;
    }
    public void undo(){
        if(returnedNumbers.isEmpty()){
            throw new RuntimeException("undo nicht möglich");
        }

    }

    public static void main(String[] args) {
        Zufallsverwaltung zv = new Zufallsverwaltung();
        System.out.println(zv.next());
        System.out.println(zv.next());
    }


}

