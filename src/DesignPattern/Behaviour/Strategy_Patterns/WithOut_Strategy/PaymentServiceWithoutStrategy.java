package DesignPattern.Behaviour.Strategy_Patterns.WithOut_Strategy;

public class PaymentServiceWithoutStrategy {

    public void processPayment(String methodType, double amount){
        if ("UPI".equals(methodType)) {
            System.out.println("Paid using UPI: " + amount);

        } else if ("CARD".equals(methodType)) {
            System.out.println("Paid using Card: " + amount);

        } else if ("WALLET".equals(methodType)) {
            System.out.println("Paid using Wallet: " + amount);

        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }

    }
}
