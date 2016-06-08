package demo;
import java.util.Calendar;

public class GreetingService {

	private Calendar cal = Calendar.getInstance();
	
	public String getMessage() {
		
		if(cal.get(Calendar.HOUR_OF_DAY) > 6) {
			return "Morning";
		}
		
		return "Noon";
		
	}
	
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
}
