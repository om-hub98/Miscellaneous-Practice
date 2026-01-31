package DesignPattern.Behaviour.Strategy_Patterns.With_Strategy;


public class PaymentMain {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new CardPayment());
        paymentService.processPayment(100);
    }
}
