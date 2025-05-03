package com.parking.payment;

public class PaymentFactory {
    public static PaymentStrategy getPaymentStrategy(String method) {
        return method.equalsIgnoreCase("card") ? new CardPayment() : new CashPayment();
    }
}
