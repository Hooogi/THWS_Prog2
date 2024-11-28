package lect_22_1;

public class yinyangLambda {
    public static void main(String[] args) {
        Runnable yin = () -> {
            while(true){
                try{
                    System.out.println("yin");
                    Thread.sleep(500);
                }
                catch(Exception e){
                }
            }
        };

        Runnable yang = () -> {
            while(true){
                try{
                    System.out.println("yang");
                    Thread.sleep(500);
                }
                catch(Exception e){
                }
            }
        };

        Thread t1 = new Thread(yin);
        Thread t2 = new Thread(yang);
        t1.start();
        t2.start();

    }
}
