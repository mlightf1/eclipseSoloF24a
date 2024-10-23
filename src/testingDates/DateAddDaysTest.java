package testingDates;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DateAddDaysTest {

	@Test
	public void stayInSameMonth() {
			
		Date startDate = new Date("June", 10, 2019);
		startDate.addOneDay();
		assertEquals(new Date("June", 11, 2019), startDate);
	}

	@Test
	public void stayInSameMonth2() {
			
		Date startDate = new Date("June", 10, 2019);
		assertEquals("Did not return correct value", new Date("June", 11, 2019), startDate.addOneDay());
	}
	
	@Test
	public void crossingMonthBoundary() {
			
		Date startDate = new Date("July", 10, 2019);
		assertEquals("Did not return correct value", new Date("July", 10, 2019), startDate.addOneDay());
	}

	@Test
	public void crossingYearBoundary() {
			
		Date startDate = new Date("June", 10, 2020);
		assertEquals("Did not return correct value", new Date("June", 11, 2020), startDate.addOneDay());
	}

}
