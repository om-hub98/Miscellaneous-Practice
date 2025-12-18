package Multithreading.ImplementatingRunnable;

import Multithreading.ExtendingThread.ExampleOfThread;

public class MultiThreadRunnableMain {
    public static void main(String[] args) {

        Thread thread1=new Thread(new ExampleOfRunnable());
        Thread thread2 = new Thread(new ExampleOfThread());
        Thread thread3 = new Thread(new ExampleOfThread());

        thread1.start();
        thread2.start();
        thread3.start();
        try{
            thread1.join();
            thread2.join();
            thread2.join();
        }catch(InterruptedException ex){
            System.out.println("Exception in main class....");
        }


        System.out.println("Runnable thread example...");
//        for (int i=0;i<5;i++){
//            System.out.println(Thread.currentThread().getName());
//        }
    }
}
