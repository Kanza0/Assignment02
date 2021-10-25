package FlightReservation.flightreservation;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.ParseException;

 

public class checkdate {
	
	public boolean isValid(String date, String travelDate)
	{
		SimpleDateFormat format= new SimpleDateFormat("dd-mm-yyyy");
		
		Date date1= 	null;
		
		try {
			date1= format.parse(date);
		
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		Date date2= null;
		try {
			date2= format.parse(travelDate);
		
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		
		if (date1.compareTo(date2) >0) {
			return false;
		}
		else if (date1.compareTo(date2) <0) {
			return true;
		}
		else if (date1.compareTo(date2) ==0) {
			return true;
		}
		return false;
	}

}
