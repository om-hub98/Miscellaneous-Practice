package DesignPattern.Creational.FactoryMethod.Transport;

/**
 * @author omraj
 */
public class Sea implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivery by sea");
    }
}
