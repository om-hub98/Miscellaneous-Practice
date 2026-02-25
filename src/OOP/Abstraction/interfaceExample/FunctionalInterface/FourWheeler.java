package OOP.Abstraction.interfaceExample.FunctionalInterface;

public class FourWheeler implements Vehicle{
    @Override
    public void engine() {
        System.out.println("Bigger engine");
    }

    public void fullWheelDrive(){
        System.out.println("FWD");
    }
}
