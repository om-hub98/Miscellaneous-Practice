package Multithreading.Locking.IntrinsicLock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkerProcess {

    Random randomNumber = new Random();

    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();

    public void stageOne(){
        try{
            Thread.sleep(1);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        //System.out.println("Stage one :"+Thread.currentThread().getName());
        list1.add(randomNumber.nextInt(100));
    }

    public void stageTwo(){
        try{
            Thread.sleep(1);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        //System.out.println("Stage Two :"+Thread.currentThread().getName());
        list2.add(randomNumber.nextInt(100));
    }

    public void process(){
        for(int i=0;i<1000;i++) {
            stageOne();
            stageTwo();
        }
    }

    public static void main(String[] args) {

        System.out.println("Starting ......");
        WorkerProcess workerProcess = new WorkerProcess();

        long start = System.currentTimeMillis();

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                workerProcess.process();
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                workerProcess.process();
            }
        });

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch(InterruptedException ex ){
            ex.printStackTrace();
        }



        long end = System.currentTimeMillis();

        System.out.println("Time Taken : "+(end-start));
        System.out.println("List1 : "+list1.size()+", "+"List2 : "+list2.size());
    }
}
