package DesignPattern.Behaviour.State_Patterns;

public class WorkingState implements ATMState{

    @Override
    public void withdrawCash() {
        System.out.println("Withdrawing Cash...");
    }

    @Override
    public void notWorking() {
        System.out.println("ATM is in maintenance mode.. ");

    }
}
