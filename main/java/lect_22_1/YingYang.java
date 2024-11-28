package lect_22_1;

import java.util.concurrent.TimeUnit;

public class YingYang {
    public static void main(String[] args) {

        Thread yin = new Thread(){
            @Override
            public void run(){
                while(true){
                    try{
                        System.out.println("yin");
                        Thread.sleep(500);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        yin.start();
        while(true){
            try{
                Thread.sleep(500);
                System.out.println("yang");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
