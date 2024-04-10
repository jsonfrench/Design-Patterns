package Observer_Pattern;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Update {

	public String dateTime;
	public String message;
	
	public Update(String message) {
		this.message = message;
		this.dateTime = getCurrentDateTime();
	}
	
	private String getCurrentDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date(); //returns system date and time
		return dateFormat.format(date);
	}


}
