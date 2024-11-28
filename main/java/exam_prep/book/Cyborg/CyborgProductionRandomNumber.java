package exam_prep.book.Cyborg;

public class CyborgProductionRandomNumber implements CyborgRandomNumber{

    @Override
    public int nextRandomNumber(int upTo) {
        return (int)(Math.random()*upTo);
    }
}
