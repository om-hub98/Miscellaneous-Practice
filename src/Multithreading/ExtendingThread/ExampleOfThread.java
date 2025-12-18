package Multithreading.ExtendingThread;

public class ExampleOfThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Thread :"+i+" -->"+Thread.currentThread());
        }
        try{
            Thread.sleep(100);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
