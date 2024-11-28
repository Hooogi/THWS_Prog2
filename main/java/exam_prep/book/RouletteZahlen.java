package exam_prep.book;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer>{

    @Override
    public Iterator<Integer> iterator(){
        return new RouletteZahlenIterator();
    }

    public static void main(String[] args) {
        RouletteZahlen rz = new RouletteZahlen();

        for(int i : rz){
            System.out.println(i);
        }

        System.out.println("-------------------------------------");
        Iterator<Integer> iterator = rz.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
