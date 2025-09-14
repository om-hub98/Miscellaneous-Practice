package DesignPattern.Creational.FactoryMethod.Transport;

/**
 * @author omraj
 */
public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by road");
    }
}
