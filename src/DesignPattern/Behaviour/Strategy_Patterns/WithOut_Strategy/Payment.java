package DesignPattern.Behaviour.Strategy_Patterns.WithOut_Strategy;

public class Payment {
    public static void main(String[] args) {

        PaymentServiceWithoutStrategy paymentServiceWithoutStrategy = new PaymentServiceWithoutStrategy();
        paymentServiceWithoutStrategy.processPayment("UPI",100.0);
    }
}
