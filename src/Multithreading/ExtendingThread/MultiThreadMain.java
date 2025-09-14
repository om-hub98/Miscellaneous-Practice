package Multithreading.ExtendingThread;

public class MultiThreadMain {
    public static void main(String[] args) {

        ExampleOfThread thread1 = new ExampleOfThread();
        thread1.start();
        for(int i=1;i<5;i++){
            System.out.println(Thread.currentThread());
        }
    }
}
