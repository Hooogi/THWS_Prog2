package lect_22_1;

public class yingyangLocalClass {

    public static void main(String[] args) {

        class localYinYang extends Thread{
            String message;
            public localYinYang(String message){
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
        }

        localYinYang yin = new localYinYang("yin");
        localYinYang yang = new localYinYang("yang");
        yin.start();
        yang.start();
    }
}
