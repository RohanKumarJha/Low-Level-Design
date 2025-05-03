package com.parking.gate;

import com.parking.parkingSpot.ticket.Ticket;

public interface CostComputationFactory {
    int computeCost(Ticket ticket);

	CostComputationFactory getCostComputation(Ticket ticket);
}
