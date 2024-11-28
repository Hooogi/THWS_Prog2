package exam_prep.ex_3;

import exam_prep.ex_3.Baum.Knoten;
public interface Visitor<T>
{
    public void visit(Knoten<T> current);
}
