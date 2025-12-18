package DesignPattern.Creational.Singleton;

/**
 * @author omraj
 */


// Singleton Class
public class SingletonClass {

    int x=10;
    private static SingletonClass instance = null;

//    public SingletonClass(){
//        System.out.println("Object is created...");
//    }

    private SingletonClass(){ }


    // this synchronized method wil prevent race condition and singleton principle will be followed
    public synchronized static SingletonClass getInstanceOfSingleton(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(instance == null){
            instance = new SingletonClass();
            System.out.println("Instance is created only once......");
            System.out.println("Current Thread : "+Thread.currentThread().getName());
        }
        return instance;
    }
    public void print(){
        System.out.println("Singleton class is called.....");
    }
}
