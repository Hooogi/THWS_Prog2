package exam_prep.ex_3;
public class Baum<E extends Comparable<E>>
{
    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;
    }
    Knoten<E> root;
    public void einfuegen(E content) {

    }
    protected void traversiere(Visitor<E> visitor)
    {
        if (root == null) return;
        else traversiere(root, visitor);
    }
    protected void traversiere(Knoten<E> current, Visitor<E> visitor)
    {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }

    public int size(){
        VisitorImpl<E> visitor = new VisitorImpl<>();
        traversiere(visitor);
        return visitor.count;
    }
}
