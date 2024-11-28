package exam_prep.ex_6;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator() {
        return new RouletteZahlenIterator();
    }

    public static void main(String[] args) {
        RouletteZahlen iterator = new RouletteZahlen();
        for(int i : iterator){
            System.out.println(i);
        }
    }
}

