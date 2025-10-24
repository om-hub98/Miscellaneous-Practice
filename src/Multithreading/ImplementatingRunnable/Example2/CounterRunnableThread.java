package Multithreading.ImplementatingRunnable.Example2;

public class CounterRunnableThread implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception occurred !! ");
            }
            System.out.println("Counter : "+Thread.currentThread().getName() + " - "+i);

            if(i==5){
                System.out.println("Game Finished : "+Thread.currentThread().getName());
            }
        }
    }
}
