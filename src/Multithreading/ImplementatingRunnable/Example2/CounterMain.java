package Multithreading.ImplementatingRunnable.Example2;

public class CounterMain {
    public static void main(String[] args) {

        CounterRunnableThread counterRunnableThread = new CounterRunnableThread();
        Thread thread1 = new Thread(counterRunnableThread);
        Thread thread2 = new Thread(counterRunnableThread);
        thread1.start();
        thread2.start();
        System.out.println("Game Start !");

        try {
            // join method is used to sync between multiple thread ,
            // suppose you have a situation where multiple thread is running & it's not synchronized then
            // main thread will finished first where still other thread are executing.
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Game Stopped !!");
    }
}
