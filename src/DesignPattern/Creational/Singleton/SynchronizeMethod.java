package DesignPattern.Creational.Singleton;

/**
 * @author omraj
 */
public class SynchronizeMethod {

    int x=10;
    private static SynchronizeMethod synchronizeMethod = null;

    private SynchronizeMethod(){ }

    public static SynchronizeMethod getInstance(){
        if(synchronizeMethod == null){
            synchronizeMethod = new SynchronizeMethod();
            System.out.println("Inside Synchronize method");
        }
        return synchronizeMethod;
    }
}
