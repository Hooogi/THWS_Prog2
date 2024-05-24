package lect_19_2;

import java.util.ArrayList;

public class GenericStack<E> implements Stack<E>{

    ArrayList<E> list;

    public GenericStack(){
        this.list = new ArrayList<>();
    }
    @Override
    public E pop(){
        return this.list.remove(list.size()-1);
    }

    @Override
    public void push(E element) {
        this.list.add(element);
    }

    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}
