package Multithreading.ExtendingThread;

public class ExampleOfThread extends Thread {
    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread());
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
