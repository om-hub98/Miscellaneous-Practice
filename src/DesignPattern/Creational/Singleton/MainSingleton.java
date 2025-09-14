package DesignPattern.Creational.Singleton;

/**
 * @author omraj
 */
public class MainSingleton {
    public static void main(String[] args) {

        // In Singleton design patterns only once instance will be created
        SynchronizeMethod test1 = SynchronizeMethod.getInstance();
        SynchronizeMethod test2 = SynchronizeMethod.getInstance();
        test1.x=test1.x+10;
        System.out.println(test1.x);
        System.out.println(test2.x);

    }
}
