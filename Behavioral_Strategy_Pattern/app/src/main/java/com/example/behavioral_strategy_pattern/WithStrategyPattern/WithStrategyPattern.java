package com.example.behavioral_strategy_pattern.WithStrategyPattern;


interface PaymentMethod {
    void paymentProcess();
}

class CreditCard implements PaymentMethod {

    @Override
    public void paymentProcess() {
        System.out.println("Making payment via Credit Card.");
    }
}

class DebitCard implements PaymentMethod {

    @Override
    public void paymentProcess() {
        System.out.println("Making payment via Debit Card.");
    }
}

class UPI implements PaymentMethod {

    @Override
    public void paymentProcess() {
        System.out.println("Making payment via UPI.");
    }
}

class PaymentService {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void pay(){
        paymentMethod.paymentProcess();
    }
}

public class WithStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentMethod(new CreditCard());
        paymentService.pay();
    }
}
