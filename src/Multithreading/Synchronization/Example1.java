package Multithreading.Synchronization;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);
        System.out.println("State of Thread 1 before thread start : "+t1.getState());
        t1.start();
        System.out.println("State of Thread 2 before thread start : "+t2.getState());
        t2.start();
        while(t1.isAlive()){
            System.out.println("State of Thread 1 : "+t1.getState());
            System.out.println("State of Thread 2 : "+t2.getState());
            Thread.sleep(1000);
        }
        System.out.println("Main method");


        //System.out.println("State of Thread 1 : "+t1.getState());
        System.out.println(counter.getCount());

    }
}
