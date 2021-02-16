package com.smarteinc.assignment.booking;

import java.time.LocalDate;

public class Ticket {
	// Only two values are allowed 1 == Bus ticket, 2 == Car ticket
	private int type;
	private String from;
	private String destination;
	// start on
	private LocalDate startDate;

	// reach on/end date
	private LocalDate endDate;

	// Traveler
	private Passenger passenger;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
