package exam_prep.book;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer> {

    int count = 0;


    @Override
    public boolean hasNext() {
        if(count == 3) return false;
        else return true;
    }

    @Override
    public Integer next() {
        int out =  (int) (Math.random()*36);
        if(out == 0) count++;
        return out;
    }
}
