package DesignPattern.Creational.FactoryMethod.Transport;
/**
 * @author omraj
 */
public class FactoryMethod {
    public Transport getTransport(String transportType){
        if(transportType.equals("road")){
            return new Truck();
        }
        else if(transportType.equals("sea")){
            return new Sea();
        }
        return null;
    }
}
