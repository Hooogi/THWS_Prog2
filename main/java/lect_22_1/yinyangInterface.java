package lect_22_1;

public class yinyangInterface implements Runnable{

    String message;
    public yinyangInterface(String message){
        this.message = message;
    }
    @Override
    public void run(){
        while(true){
            try{
                System.out.println(this.message);
                Thread.sleep(500);
            }
            catch(Exception e ){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        yinyangInterface yin = new yinyangInterface("yin");
        yinyangInterface yang = new yinyangInterface("yang");
        Thread t1 = new Thread(yin);
        Thread t2 = new Thread(yang);
        t1.start();
        t2.start();
    }
}
