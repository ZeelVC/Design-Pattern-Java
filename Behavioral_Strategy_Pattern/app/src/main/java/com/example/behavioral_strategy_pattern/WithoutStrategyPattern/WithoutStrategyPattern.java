package com.example.behavioral_strategy_pattern.WithoutStrategyPattern;


import android.os.health.SystemHealthManager;

class PaymentService {
    public void paymentProcess(String paymentMethod){
        if(paymentMethod.equals("Debit Card")){
            System.out.println("Making payment via Debit Card.");
        } else if (paymentMethod.equals("Credit Card")) {
            System.out.println("Making payment via Credit Card.");
        } else if (paymentMethod.equals("UPI")) {
            System.out.println("Making payment via UPI");
        } else {
            System.out.println("Invalid Payment Method.");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.paymentProcess("UPI");
    }
}
