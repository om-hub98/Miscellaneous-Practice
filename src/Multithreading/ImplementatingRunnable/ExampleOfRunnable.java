package Multithreading.ImplementatingRunnable;

public class ExampleOfRunnable implements Runnable{
    @Override
    public void run() {
        try{
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName());
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
