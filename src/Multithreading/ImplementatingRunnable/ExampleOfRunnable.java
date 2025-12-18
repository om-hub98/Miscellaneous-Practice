package Multithreading.ImplementatingRunnable;

public class ExampleOfRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);

            try{
                Thread.sleep(1000);
            }catch (Exception ex){
                System.out.println(ex);
            }
        }
    }
}
