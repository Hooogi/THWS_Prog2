package exam_prep.book.Cyborg;

import java.util.Iterator;

public class CyborgTaetigkeitenIterator implements Iterator<Taetigkeit> {

    int count = 0;
    CyborgProductionRandomNumber cprn;

    public CyborgTaetigkeitenIterator(CyborgProductionRandomNumber cprn){
        this.cprn = cprn;
    }
    @Override
    public boolean hasNext() {
        return count != 3;
    }

    @Override
    public Taetigkeit next() {
        Taetigkeit[] taetigkeit = Taetigkeit.values();
        Taetigkeit out = taetigkeit[cprn.nextRandomNumber(taetigkeit.length)];
        if(out.equals(Taetigkeit.SERVICE)) count++;
        return out;
    }
}
