package Multithreading.VolatileKeyword;

import java.util.Scanner;

 /**
  * volatile ensures that any write to a volatile variable is immediately visible to other threads,
  * and any read of a volatile variable always retrieves the latest value from main memory.
  * This prevents threads from working with stale cached values.
  *
  *
  * volatile = it ensures data consistency for varaible between multiple threads
  *
  * basic synchronization
  * */

class Process extends Thread{

    public volatile boolean start = true;
    @Override
    public void run() {

        while(start){
            System.out.println("Process started...");

            try{
                Thread.sleep(100);
            }catch (InterruptedException ex){
               ex.printStackTrace();
            }
        }
    }

    public void shutdown(){
        start = false;
    }
}

public class VolatileKeywordExample {
    public static void main(String[] args) {

        Process p1 = new Process();
        p1.start();

        System.out.println("Press enter any key to stop...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        p1.shutdown();

    }
}
