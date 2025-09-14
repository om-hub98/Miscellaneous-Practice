package Multithreading.DaemonThread;

class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("My thread running");
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("Main method");
    }
}
