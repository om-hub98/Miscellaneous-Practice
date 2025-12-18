package DesignPattern.Creational.Singleton;

/**
 * @author omraj
 */
public class MainSingleton {
    public static void main(String[] args) {

        // In Singleton design patterns only once instance will be created
//        SingletonClass test1 = SingletonClass.getInstanceOfSingleton();
//        SingletonClass test2 = SingletonClass.getInstanceOfSingleton();
//        System.out.println("Hashcode of 1st object : "+test1.hashCode());
////        SingletonClass obj1 = new SingletonClass();
////        SingletonClass obj2 = new SingletonClass();
//        test1.x=test1.x+10;
//        System.out.println(test1.x);
//        System.out.println(test2.x);
        //System.out.println(obj1.x);



        // Multithreading example for the Singleton class
        System.out.println("Thread started.....");
        System.out.println("=== Testing Thread Safety ===");
        Thread[] threads = new Thread[5];
        for(int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                SingletonClass instance = SingletonClass.getInstanceOfSingleton();
                System.out.println(Thread.currentThread().getName() +
                        " got instance: " + System.identityHashCode(instance));
            }, "Thread-" + i);

        }
        for(Thread thread:threads){
            thread.start();
        }

        for(Thread thread:threads){
            try{
                thread.join();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }


        System.out.println("Main method exit .....");

//        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
//
//        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

    }
}
