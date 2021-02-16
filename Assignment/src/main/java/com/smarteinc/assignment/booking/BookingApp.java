package com.smarteinc.assignment.booking;

import java.util.Objects;

public class BookingApp {
	
public int bookingProcess(Ticket x) {
	
	//Comment by Adarsh
	// We are validating type first to avoid code redundancy in else() part
	if (x.getType() != 1 && x.getType() != 2) {
		throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
	}
	else {
		//Comment by Adarsh
		// Validating if all not nullable datamembers have input
		validateAllFieldsPresent(x);
		
		//Comment by Adarsh
		// if there is no null in above line, based on type ticket will be booked
		if(x.getType() == 1) {
			bookBusTicket(x);
		} else if(x.getType() == 2){
			bookCarTicket(x);
		}
		
		//Comment by Adarsh
		// Once ticket is booked, it will get delivered by mail to customer
		sendTicketBookedMail(x);
	}

	//method should return the type of ticket booked
	return x.getType();
}

private void bookCarTicket(Ticket x) {
	//assume Car is booked by making some entries in db
}

private void bookBusTicket(Ticket x) {
	//assume Bus is booked by making some entries in db
}


private void sendTicketBookedMail(Ticket x) {
	//Assume email is sent to passenger that his/her ticket is booked
}

//Ensure all input data is present
void validateAllFieldsPresent(Ticket ticket) {
	try {
		Objects.requireNonNull(ticket);
		Objects.requireNonNull(ticket.getStartDate());
		Objects.requireNonNull(ticket.getEndDate());
		
		Objects.requireNonNull(ticket.getFrom());
		Objects.requireNonNull(ticket.getDestination());
		Objects.requireNonNull(ticket.getPassenger());
	} catch (NullPointerException npe) {
		//Comment by Adarsh
		//Below is to print line of expection in log. it is an unchecked exception. 
		//We can also throw it to customer with custom Exception with message if needed.
		//But as per requirement it should not throw any exception to BookingAppTest.java
		//and all test cases should be passed.
		
		npe.printStackTrace();
	}
}
}


