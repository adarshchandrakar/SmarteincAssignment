import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.smarteinc.assignment.booking.BookingApp;
import com.smarteinc.assignment.booking.Passenger;
import com.smarteinc.assignment.booking.Ticket;

public class BookingAppTest {
	
	static int BUS_TICKET = 1, CAR_TICKET = 2;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void test_invalid_ticket_type_throw_exception() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Only type 1 and 2 tickets are supported");
		
		BookingApp app = new BookingApp();
		
		Passenger passenger = new Passenger();
		passenger.setName("Ravikant");
		
		Ticket ticket = new Ticket();
		//set traveler
		ticket.setPassenger(passenger);
		
		ticket.setType(3); // Unsupported Type passed here
		
		ticket.setFrom("MUM");
		ticket.setDestination("DEL");
		
		// This date is the travel start date
		ticket.setStartDate(null);
		
		// This date is the travel end date
		ticket.setEndDate(LocalDate.of(2021, 4, 2));
		
		app.bookingProcess(ticket);
	}
	
	@Test
	public void test_valid_ticket() {
		
		BookingApp app = new BookingApp();
		
		Passenger passenger = new Passenger();
		passenger.setName("Ravikant");
		
		Ticket ticket = new Ticket();
		//set traveler
		ticket.setPassenger(passenger);
		
		ticket.setType(CAR_TICKET); // Unsupported Type passed here
		
		ticket.setFrom("MUM");
		ticket.setDestination("DEL");
		
		// This date is the travel start date
		ticket.setStartDate(LocalDate.of(2021, 4, 1));
		
		// This date is the travel end date
		ticket.setEndDate(LocalDate.of(2021, 4, 2));
		
		int bookedTicketType = app.bookingProcess(ticket);
		
		assertTrue(true);
	}
	
	
	@Test
	public void test_valid_car_ticket_booked() {
		
		BookingApp app = new BookingApp();
		
		Passenger passenger = new Passenger();
		passenger.setName("Ravikant");
		
		Ticket ticket = new Ticket();
		//set traveler
		ticket.setPassenger(passenger);
		
		ticket.setType(CAR_TICKET); // Unsupported Type passed here
		
		ticket.setFrom("MUM");
		ticket.setDestination("DEL");
		
		// This date is the travel start date
		ticket.setStartDate(LocalDate.of(2021, 4, 1));
		
		// This date is the travel end date
		ticket.setEndDate(LocalDate.of(2021, 4, 2));
		
		int bookedTicketType = app.bookingProcess(ticket);
		
		assertTrue(bookedTicketType == CAR_TICKET);
	}
	
	@Test
	public void test_valid_bus_ticket_booked() {
		
		BookingApp app = new BookingApp();
		
		Passenger passenger = new Passenger();
		passenger.setName("Ravikant");
		
		Ticket ticket = new Ticket();
		//set traveler
		ticket.setPassenger(passenger);
		
		ticket.setType(BUS_TICKET); // Unsupported Type passed here
		
		ticket.setFrom("MUM");
		ticket.setDestination("DEL");
		
		// This date is the travel start date
		ticket.setStartDate(LocalDate.of(2021, 4, 1));
		
		// This date is the travel end date
		ticket.setEndDate(LocalDate.of(2021, 4, 2));
		
		int bookedTicketType = app.bookingProcess(ticket);
		
		assertTrue(bookedTicketType == BUS_TICKET);
	}
	

}
