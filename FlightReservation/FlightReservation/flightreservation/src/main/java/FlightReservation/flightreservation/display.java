package FlightReservation.flightreservation;



import java.util.ArrayList;

public class display {

	public void displaydetails(ArrayList<flightinfo> travelList)
	{
		
		for(flightinfo traveldetails : travelList)
		{
			System.out.println();
			System.out.println("\t | \t" + traveldetails.gettravelOrigin());
			System.out.println("\t | \t" + traveldetails.gettravelDestination());
			System.out.println("\t | \t" + traveldetails.gettravelDate());
			System.out.println("\t | \t" + traveldetails.gettravelTime());
			System.out.println("\t | \t" + traveldetails.gettravelClass());
			System.out.println("\t | \t" + traveldetails.getfare());
			System.out.println("\t | \t" + traveldetails.gettravelDuration());
			System.out.println("\t | \t" + traveldetails.getseatAvailable());
			
			
		}
		
	if (travelList.isEmpty())
		System.out.println("No flights available at the moment");
			
	}
}



