package demo;

public class LeapYearUtil {

	public boolean isLeapYear(int i)  throws Exception {
		if(i<0) throw new Exception();
		return (i % 4)==0;
	}

}
