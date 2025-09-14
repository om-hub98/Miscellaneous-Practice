package DesignPattern.Creational.FactoryMethod;

import DesignPattern.Creational.FactoryMethod.Transport.FactoryMethod;
import DesignPattern.Creational.FactoryMethod.Transport.Transport;

/**
 * @author omraj
 */
public class DriverMain {
    public static void main(String[] args) {

        FactoryMethod factoryMethod = new FactoryMethod();
        Transport sea = factoryMethod.getTransport("sea");
        sea.deliver();

    }
}
