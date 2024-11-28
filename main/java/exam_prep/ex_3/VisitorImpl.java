package exam_prep.ex_3;

public class VisitorImpl<T> implements Visitor<T>{
    int count;
    @Override
    public void visit(Baum.Knoten<T> current) {
        count++;
    }
}
