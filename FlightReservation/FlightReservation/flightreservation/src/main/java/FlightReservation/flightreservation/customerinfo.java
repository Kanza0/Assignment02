package FlightReservation.flightreservation;


import java.util.Scanner;
import java.util.StringTokenizer;

//import FlightManagSys.LoginErrorException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class customerinfo {

	String name,  gender,address,passportNumber,loginpassword, ticketNumber, seatNumber;
	String age;
	
	//flightinfo flight= new flightinfo();
	
	void Customer() throws IOException/*,negativeAgeException*/, negativeAgeException{
		
	
		Scanner scanner= new Scanner(System.in);
	
		//name
	System.out.print("Name: ");
	name= scanner.nextLine();
	System.out.print("age: ");
	age= scanner.nextLine();
	
	if(Integer.parseInt(age)<0)
		throw new negativeAgeException ("Age cannot be negative");
	
	//gender
	System.out.print("gender: ");
	gender= scanner.nextLine();
	
	//address
	System.out.print("Address : ");
    address= scanner.nextLine();
    
    
    System.out.print("PassportNumber: ");
    passportNumber= scanner.nextLine();
    
    System.out.print("TicketNumber: ");
    ticketNumber= scanner.nextLine();
    
    System.out.print("Enter your login Password that you want to create: ");
    loginpassword= scanner.nextLine();  
    
    //filehandling
     File f= new File ("Customer.txt");
     FileWriter fw= new FileWriter(f);
     fw.write(loginpassword+","+name+","+age+","+gender+","+ticketNumber+","+passportNumber+","+address+"\n");
     fw.close();
	}
	
	void cancelflight()
	{     
		Scanner scanner= new Scanner(System.in);
		
		//name
	System.out.print("Enter your ticket number so we can cancel the flight\n ");
	String tc= scanner.nextLine();
	if(ticketNumber.equals(tc))
		System.out.println("Ticket number desnt match\n");
	else {
	ticketNumber=""; seatNumber="";}
	
	}
     void pay()
     {
    	 System.out.print("You can pay either by cash or credit card. Choose your option: ");
    	   Scanner scanner= new Scanner(System.in);
    	   String option= scanner.nextLine();
    	   
    	   if(option.equals("card")) {
    		   System.out.print("card number: ");
    		   String card= scanner.nextLine();
    		   
    		   System.out.print("\n ");
    		   
    		   System.out.print("PIN: ");
    		   String pin= scanner.nextLine();
    		   
    		   System.out.print("\n ");
    		   
    		   System.out.print("Payment has been made. Take your ticket");
    	   }
    	   else 
    		   System.out.print("payment conducted via cash");
    	   System.out.println("Name: "+name+"\n"+"Gender: "+gender+"\n"+"Address: "+address+"\n"+"Passport Number: "+passportNumber+"\n"
   				+"Ticket Number: "+ticketNumber+"\n"+"Seat Number: \n");
    	   scanner.close();
	
	
	}

     	void login() throws IOException, InvalidUserInfoException
     	{
     		Scanner scanner= new Scanner(System.in);
     		System.out.print("Enter your login Password: ");
     	   String password= scanner.nextLine();  
     	   
     	  File f= new File ("Customer.txt");
          FileReader fw= new FileReader(f);
     	    BufferedReader bf=new BufferedReader(fw);
     	    String line;boolean found=false;
     	    while((line=bf.readLine())!=null)
     	    {
     	    	StringTokenizer tk=new StringTokenizer(line,",");
     	    	String pass=tk.nextToken();
     	    	if(pass.equals(password))
     	    	{System.out.print(line);
     	    		loginpassword=password;name=tk.nextToken();age=tk.nextToken();found=true;
     	    		gender=tk.nextToken();address=tk.nextToken();break;
     	    	}
     	    }
     	   if(!found)
     	    	throw new  InvalidUserInfoException("User not found");
     	}
     	 
		/*
		 * void CancelRegistration() { Scanner scanner= new Scanner(System.in);
		 * System.out.print("Enter your login Password: "); String password=
		 * scanner.nextLine(); }
		 */
}
