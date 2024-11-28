package exam_prep.ex_6;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer> {

    int count = 0;

    @Override
    public boolean hasNext() {
        if(count==3){
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {
        if(hasNext()){
            int out = (int) (Math.random()*36);
            if(out == 0){
                count++;
            }
            return Integer.valueOf(out);
        }
        return null;
    }
}
