package Multithreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorService {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        // creates single thread on one pool
        //executor.submit(()-> System.out.println(Thread.currentThread().getName()));
        //executor.shutdown();

        // This creates multiple threads but max is 3 threads , when task is provided
        for (int i = 0; i < 5; i++) {
            executor.submit(() ->
                    System.out.println(Thread.currentThread().getName())
            );
        }
        executor.shutdown();

    }
}
