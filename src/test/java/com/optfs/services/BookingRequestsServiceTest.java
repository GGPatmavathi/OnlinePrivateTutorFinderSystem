package com.optfs.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.optfs.entities.BookingRequests;
import com.optfs.entities.Parent;
import com.optfs.entities.Tutor;
import com.optfs.exceptions.NullValuesFoundException;

@SpringBootTest
class BookingRequestsServiceTest {
	
	@Autowired
	BookingRequestsService bookingService;
	
	Parent p = new Parent(null,"Test","Parent","testparent@gmail.com","123");
	Tutor t = new Tutor(null,"Test","Tutor","testtutor@gmail.com","123", "Physics", 7, true);
	BookingRequests d = new BookingRequests(null, p, t, false);

	@Test
	@Disabled
	void testSendBookingRequest() throws NullValuesFoundException {

     assertThrows(NullValuesFoundException.class, () -> bookingService.sendBookingRequest(d));
	}

	@Test
	void testGetBookingRequestsByTutorId() throws NullValuesFoundException {
		assertThrows(NullValuesFoundException.class, () -> bookingService.getBookingRequestsByTutorId(0));
		
	}

	@Test
	void testGetBookingRequestsByParentId()  throws NullValuesFoundException {
		 assertThrows(NullValuesFoundException.class, () -> bookingService.getBookingRequestsByParentId(0));
	}

	@Test
	@Disabled
	void testUpdateBookingRequest() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDeleteBookingRequest()  throws NullValuesFoundException {
		 assertThrows(NullValuesFoundException.class, () -> bookingService.deleteBookingRequest(d));
	}

}
