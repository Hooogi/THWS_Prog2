package exam_prep.book;

import java.util.ArrayDeque;
import java.util.Deque;

public class Zufallsverwaltung {

    Deque<Double> returnedNumbers = new ArrayDeque<>();
    Deque<Double> undoNumbers = new ArrayDeque<>();
    public double next(){
        double out;
        if(!undoNumbers.isEmpty()){
            out = undoNumbers.pop();
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
        double d = returnedNumbers.pop();
        undoNumbers.push(d);
        returnedNumbers.push(d);
    }

    public static void main(String[] args) {
        Zufallsverwaltung zv = new Zufallsverwaltung();
        System.out.println(zv.next());
        System.out.println(zv.next());
    }


}
