package testingDates;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DateSetDateTest {

	@Test
	public void stayInSameMonth() {
	Date bob = new Date();
	bob.setDate("June", 10, 2019);
	assertEquals("June", 10, 2019, bob);	
	}

	private void assertEquals(String string, int i, int j, Date bob) {
		
	}//
	 
/*
 * 6. Next, create a DateSetDateTest test class.
 *  This should include tests that
 *  invoke Date.setDate(String,int,int)
 *  for several illegal and legal dates.
 *  In each case, if the change is legal, 
 *  it should occur, if not, the target object 
 *  should not change.  For all legal changes your 
 *  asserts should be checking that the value of the 
 *  target object is correct after setDate is invoked.  
 *  (We can't check the return values of setDate, as 
 *  it is a void method.) Your code will be something like

Date bob = ...blah...;
bob.setDate(...legal value...);
assertEquals(...legal value..., bob);


If the change is illegal, you'll
 have a similar test, but are checking 
 that the target object's values was not changed 
 by the invocation of setDate.  The tests might not
  pass at this point, because you've not yet fully 
  altered setDate.
  
  Important: In DateSetDateTest do not invoke the constructor with the signature Date(String, int, int).  This constructor calls setDate(String, int, int) and that's the method you will be altering.  Instead, use the constructor Date(int month, int day, int year).

With the stubs complete, your tests should run, but shouldn't yet all pass.
*/
	}

