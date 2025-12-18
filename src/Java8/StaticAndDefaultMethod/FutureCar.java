package Java8.StaticAndDefaultMethod;

public class FutureCar implements Vehicle, Plane{


    @Override
    public void start() {
        System.out.println("Car starts...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped....");
    }

    @Override
    public void swim() {
        Plane.super.swim();
    }
}
