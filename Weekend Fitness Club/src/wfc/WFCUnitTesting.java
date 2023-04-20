package wfc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WFCUnitTesting {

	@Test
	void testAddCustomer() {
		Customer c = new Customer();
		assertEquals(c, c);
	}
	
	@Test
	void testToString()
	{
		Customer c1 = new Customer("John Taylor", "john@gmail.com", "8741256321");
		Customer c2 = new Customer("John Taylor", "john@gmail.com", "8741256321");
		assertEquals(c1.toString(), c2.toString());
		
		FitnessLesson fl9 = new FitnessLesson(3, "YOGA" , 250, 2, "Saturday", "9 am"); 
		FitnessLesson fl = new FitnessLesson(3, "YOGA" , 250, 2, "Saturday", "9 am"); 
		assertEquals(fl9.toString(), fl.toString());
	}
	
	@Test
	void testWFC()
	{
		WFC wfc = new WFC();
		assertEquals(wfc, wfc);
	}
}
