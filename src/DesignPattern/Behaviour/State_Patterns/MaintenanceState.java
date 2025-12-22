package DesignPattern.Behaviour.State_Patterns;

public class MaintenanceState implements ATMState{
    @Override
    public void withdrawCash() {
        System.out.println("Under Maintenance period...");
        //atmMachineObj.setAtmState(new WorkingState());
    }

    @Override
    public void notWorking() {
        System.out.println("Under Maintenance");
    }
}
