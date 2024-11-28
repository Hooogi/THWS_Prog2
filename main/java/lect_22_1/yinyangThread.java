package lect_22_1;

public class yinyangThread extends Thread{

    String message;
    public yinyangThread(String message){
        this.message = message;
    }

    @Override
    public void run(){
        while(true){
            try{
                System.out.println(this.message);
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        yinyangThread yin = new yinyangThread("yin");
        yinyangThread yang = new yinyangThread("yang");
        yin.start();
        yang.start();
    }
}
