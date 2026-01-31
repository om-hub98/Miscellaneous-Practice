package DesignPattern.Behaviour.Strategy_Patterns.With_Strategy;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amopunt){
        paymentStrategy.pay(amopunt);
    }
}
