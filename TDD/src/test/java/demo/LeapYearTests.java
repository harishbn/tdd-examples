package demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(Parameterized.class)
public class LeapYearTests {
	
	@Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][]{
			{2000, true},
			{2016, true},
			{1999, false},
			{2004, false}
		});
	}
	
	private int year;
	private boolean result;
	public LeapYearTests(int year, boolean result) {
		this.year = year;
		this.result= result;
	}
	
	@Test
	public void testLeapYear() throws Exception{
		LeapYearUtil util = new LeapYearUtil();
		assertEquals(util.isLeapYear(year), result);
	}
}
