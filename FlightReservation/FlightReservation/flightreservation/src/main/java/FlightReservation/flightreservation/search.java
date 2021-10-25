package FlightReservation.flightreservation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*; 


public class search {

	ArrayList<flightinfo> list= new ArrayList<flightinfo>();
	
	display disp= new display();
	
	public void searchflight(List<flightinfo> list1, String origin, String destination, String date, String flightclass) throws FileNotFoundException, noavailableseatException
	{
		for(flightinfo f: list1) {
			if (f.gettravelOrigin().equalsIgnoreCase(origin) && f.gettravelDestination().equalsIgnoreCase(destination) && f.getseatAvailable().equalsIgnoreCase("y") && (new checkdate().isValid(date, f.gettravelDate())) && (f.gettravelClass().equalsIgnoreCase(flightclass) || f.gettravelClass().equalsIgnoreCase("EB"))) {
				flightinfo d= new flightinfo(f.getflightNumber(), f.gettravelOrigin(),f.gettravelDestination(),f.gettravelDate(),f.gettravelTime(), f.gettravelDuration(),f.getfare(),f.getseatAvailable(), f.gettravelClass());
				
				if(!f.getseatAvailable().equalsIgnoreCase("y"))
					throw new noavailableseatException("no avaialable seat\n");
				if (list1.get(7).equals("E"))
				{
					System.out.println("dsfdsffds ");
					d.setfare(f.getfare() + ((0.2) * f.getfare()));
				
				}
				list.add(d);
			}
		}
	}

	public void sortVals(int option)
	{
		if (option== 1)
		{
			Collections.sort(list, new Comparator<flightinfo>() {
				public int compare(flightinfo o1 , flightinfo o2) {
					return (int) (o1.getfare() - o2.getfare());
				}
			});
		}
		else {
			System.out.println("invalid opotion");
			return ;
		}
		disp.displaydetails(list);
	}

}