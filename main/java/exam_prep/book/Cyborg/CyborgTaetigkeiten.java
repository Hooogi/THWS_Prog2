package exam_prep.book.Cyborg;

import java.util.Iterator;

public class CyborgTaetigkeiten implements Iterable<Taetigkeit>{
    CyborgProductionRandomNumber cprn;
    @Override
    public Iterator<Taetigkeit> iterator() {
        return new CyborgTaetigkeitenIterator(cprn);
    }

    public CyborgTaetigkeiten(CyborgProductionRandomNumber cprn){
        this.cprn = cprn;
    }

    public static void main(String[] args) {
        CyborgTaetigkeiten cyborg = new CyborgTaetigkeiten(new CyborgProductionRandomNumber());
        for(Taetigkeit t : cyborg){
            System.out.println(t.name());
        }
    }
}
