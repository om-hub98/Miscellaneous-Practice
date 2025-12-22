package DesignPattern.Behaviour.State_Patterns;

public class MainClient {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(new WorkingState());
        atmMachine.request();
        atmMachine.setAtmState(new MaintenanceState());
        atmMachine.request();


    }
}
