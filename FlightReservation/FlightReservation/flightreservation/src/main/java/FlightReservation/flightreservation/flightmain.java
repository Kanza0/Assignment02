package FlightReservation.flightreservation;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class flightmain {
	public static void main(String[] arg) throws IOException, negativeAgeException, InvalidUserInfoException, noavailableseatException
	{
		customerinfo c=new customerinfo();
		c.Customer();
		c.login();
		
		admin ad=new admin();
		ad.admin();
		ad.login();
	ArrayListdetails info= new ArrayListdetails();
		
		//input from the user
	Scanner scanner= new Scanner(System.in);
	
	String travelDestination;
	String travelOrigin;
	String travelClass;
	String travelDate;
	 
	int option;
	//origin
	System.out.print("Please enter your origin");
	travelOrigin= scanner.nextLine();
	
	//destination
	System.out.print("Please enter your destination");
	travelDestination= scanner.nextLine();
	
	//flightClass
	System.out.print("Please enter the flight class\n Business, Economy, First class");
	travelClass= scanner.nextLine().toUpperCase();
	
	//date
	System.out.print("Plesae enter the fligth date:");
    travelDate= scanner.nextLine();
    
    
    System.out.print("What would you want to view \n 1. lowest fare \n 2.flight duration" + "");
	option= scanner.nextInt();
	
	
	/*
	 * search fd= new search(); try { fd.searchflight(info.getArray(), travelOrigin,
	 * travelDestination, travelClass , travelDate ); } catch (FileNotFoundException
	 * e) { e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * fd.sortVals(option);
	 */
    // scanner.close();
	
	
	}
}







