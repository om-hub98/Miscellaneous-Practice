package Multithreading.ExtendingThread;

public class MultiThreadMain {
    public static void main(String[] args) {

        //System.out.println(Thread.currentThread());
        ExampleOfThread thread1 = new ExampleOfThread();
        thread1.start();

        ExampleOfThread thread2 = new ExampleOfThread();
        thread2.start();

    }
}
