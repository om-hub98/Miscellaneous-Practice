package Java8.StaticAndDefaultMethod;

public interface Vehicle {
    void start();
    void stop();

    static void fly(){
        System.out.println("Vehicle can fly...");
    }

    default void swim(){
        System.out.println("Vehicle Can swim...");
    }
}
