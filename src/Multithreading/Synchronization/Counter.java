package Multithreading.Synchronization;

public class Counter {
    private int count = 0;
    public synchronized void increment(){
        count++;
        System.out.println("Count : "+count);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public int getCount(){
        return count;
    }
}