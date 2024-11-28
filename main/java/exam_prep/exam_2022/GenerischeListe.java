package exam_prep.exam_2022;

import java.util.ArrayList;
import java.util.Collection;

public class GenerischeListe<E> extends ArrayList<E> {

    public GenerischeListe(Collection<? extends E> c){
        super(c);
    }

    @Override
    public boolean add(E e) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Hinzufügen nicht erlaubt!");
    }

}
