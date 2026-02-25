package OOP.Abstraction.interfaceExample.FunctionalInterface;

public interface Vehicle {

    void engine();
    default void fullWheelDrive(){
        System.out.println("Only four wheeler has");
    }
}
