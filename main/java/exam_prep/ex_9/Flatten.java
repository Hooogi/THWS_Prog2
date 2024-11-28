package exam_prep.ex_9;

import java.util.ArrayList;
import java.util.List;

public class Flatten {

    public static <E> List<E> flatten(List<List<E>> list){
        List<E> out = new ArrayList<>();
        for(List sublist: list){
            out.addAll(sublist);
        }
        return out;
    }

    public static void main(String[] args) {
        String[] arr = {"Tom","Marlene","Lukas","Denis","Bob","Tobi","Julian","Kevin","Killian","Michael","Timo"};
        List<List<String>> list = new ArrayList<>();
        for(int i = 0; i< arr.length; i+=2){
            List<String> test = new ArrayList<>();
            for(int j = i; j<i+2 && j<arr.length; j++){
                test.add(arr[j]);
            }
            list.add(test);
        }
        list.stream().forEach(sublist -> System.out.println(sublist));
        List<String> newList = flatten(list);
        newList.stream().forEach(System.out::println);
    }
}
