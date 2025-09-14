package OOP.Abstraction.interfaceExample;

public class CarMain {
    public static void main(String[] args) {
        CarImplement car = new CarImplement();
        car.setStart(true);
        car.drive();
    }
}
