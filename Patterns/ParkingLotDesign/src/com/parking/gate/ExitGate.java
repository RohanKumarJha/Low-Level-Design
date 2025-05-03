package com.parking.gate;

import com.parking.parkingSpot.ticket.Ticket;
import com.parking.payment.PaymentFactory;

public class ExitGate {
    private PaymentFactory paymentFactory;
    private CostComputationFactory costComputationFactory;

    public int processExit(Ticket ticket, String paymentMethod) {
        int price = costComputationFactory.getCostComputation(ticket).computeCost(ticket);
        PaymentFactory.getPaymentStrategy(paymentMethod).processPayment(price);
		return price;
    }
}

