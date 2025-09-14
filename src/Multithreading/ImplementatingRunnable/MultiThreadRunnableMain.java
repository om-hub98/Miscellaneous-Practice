package Multithreading.ImplementatingRunnable;

import Multithreading.ExtendingThread.ExampleOfThread;

public class MultiThreadRunnableMain {
    public static void main(String[] args) {
        Runnable exampleOfThread=new ExampleOfRunnable();
        Thread thread1=new Thread(exampleOfThread);
        thread1.start();
        System.out.println("Runnable thread example...");
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
