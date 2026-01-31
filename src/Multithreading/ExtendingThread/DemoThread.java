package Multithreading.ExtendingThread;

public class DemoThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(() -> System.out.println("Task 1"));
        Thread t2 = new Thread(() -> System.out.println("Task 2"));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("Main thread stops");

    }
}
