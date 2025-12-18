package DesignPattern.Creational.Singleton;

public class ThreadSafeSingleton{

    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton(){
        System.out.println("Constructor is called....");
    }

//    @Override
//    public void run() {
//        super.run();
//
//        System.out.println("Current Thread instances : "+Thread.currentThread().getName());
//
//        try{
//            Thread.sleep(1000);
//            System.out.println("Current instance of class : "+threadSafeSingleton);
//        }
//        catch(InterruptedException ex){
//            throw new RuntimeException();
//        }
//
//    }

    // Intrinsic lock
    public static synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton == null){   // Locking = to check single instance of class
            System.out.println("Creating Single object of a class.....");
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

}
