package DesignPattern.Behaviour.State_Patterns;

public class WorkingState implements ATMState{

    @Override
    public void withdrawCash() {
        System.out.println("Withdraw Cash...");
    }

    @Override
    public void notWorking() {
        /// some operation
    }
}
