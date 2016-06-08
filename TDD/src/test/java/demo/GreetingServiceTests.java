package demo;
import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class GreetingServiceTests {

	@Test
	public void testIfMessageIsRightForMorning() {
		GreetingService src = new GreetingService();
		Calendar mycal = Calendar.getInstance();
		mycal.set(Calendar.HOUR_OF_DAY, 7);
		src.setCal(mycal);
		
		assertEquals("Morning", src.getMessage());
	}
}



