package lect_22_2;

import java.util.ArrayList;
import java.util.HashMap;

public class PrimzahlThread extends Thread {

    ArrayList<Integer> numbers;
    HashMap<Integer, Boolean> result = new HashMap<>();
    public PrimzahlThread(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
    public boolean testPrim(int number) {
        if (number < 2) return false;
        for (int divisor = 2; divisor < number; divisor++)
            if (number % divisor == 0) return false;
        return true;
    }

    @Override
    public void run() {
        for(int num : numbers){
            result.put(num,testPrim(num));
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < 10; j++) {
                list.get(i).add((int) (Math.random() * 100) + 1);
            }
        }
        ArrayList<PrimzahlThread> threads = new ArrayList<>();
        for(int i = 0; i<=3; i++){
            threads.add(new PrimzahlThread(list.get(i)));
            threads.get(i).start();
        }
        try {
            for(Thread thread : threads){
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        HashMap<Integer,Boolean> bigResult = new HashMap<>();
        for(PrimzahlThread thread : threads){
            bigResult.putAll(thread.result);
        }
        for(int num : bigResult.keySet()){
            System.out.println(num + " : " + bigResult.get(num));
        }
    }
}