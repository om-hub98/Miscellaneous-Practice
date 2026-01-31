package DesignPattern.Behaviour.Strategy_Patterns.With_Strategy;

public class UPIPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid using UPI : "+amount);
    }
}