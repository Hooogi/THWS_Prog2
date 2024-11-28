package lect_21_3;

public class Binarytree<E> {

    Element<E> root;
    private class Element<E>{

        String name;
        Element<E> left;
        Element<E> right;
    }

    public void add(Element<E> e){
        if(root == null){
            this.root = e;
        }
        else{
            add(root, e);
        }
    }

    private void add(Element<E> temp, Element<E> e){
        if(e.name.compareTo(temp.name)<0){
            if(temp.left == null){
                temp.left = e;
            }
            else{
                add(temp.left, e);
            }
        }
        else{
                if(temp.right == null){
                    temp.right = e;
                }
                else{
                    add(temp.right, e);
                }
        }
    }

    public void print(){
        print(root);
    }

    public void print(Element<E> element){
        if(element != null){
            System.out.println("Ohne Wurzel kein Baum!");
        }
        if(element.left != null){
            print(element.left);
        }
        System.out.println(element.name);
        if(element.right != null){
            print(element.right);
        }
    }
}
