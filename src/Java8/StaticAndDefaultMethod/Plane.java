package Java8.StaticAndDefaultMethod;

public interface Plane {
    void start();
    void stop();

    static void fly(){
        System.out.println("Plane can fly...");
    }

    default void swim(){
        System.out.println("Plane Can swim...");
    }
}
