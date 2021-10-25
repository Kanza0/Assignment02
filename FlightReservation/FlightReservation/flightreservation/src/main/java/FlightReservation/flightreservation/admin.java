package FlightReservation.flightreservation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class admin {

	String admin_loginid;
	String name;
	
//	/void 
	void admin() throws IOException
	
	{
		
		Scanner scanner= new Scanner(System.in);
	
		//name
	System.out.print("Name: ");
	name= scanner.nextLine();
	
    System.out.print("Enter your admin id that you want to create during login: ");
    admin_loginid= scanner.nextLine();  
    
    //filehandling
     File f= new File ("Administrator.txt");
     FileWriter fw= new FileWriter(f);
     fw.write(admin_loginid+","+name+"\n");
     fw.close();
	}
     

     	void login() throws IOException
     	{
     		Scanner scanner= new Scanner(System.in);
     		System.out.print("Enter your login Admin id: ");
     	   String password= scanner.nextLine();  
     	   
     	  File f= new File ("Administrator.txt");
          FileReader fw= new FileReader(f);
     	    BufferedReader bf=new BufferedReader(fw);
     	    String line;
     	    while((line=bf.readLine())!=null)
     	    {
     	    	StringTokenizer tk=new StringTokenizer(line,",");
     	    	String pass=tk.nextToken();
     	    	if(pass.equals(password))
     	    	{System.out.print(line);
     	    	admin_loginid=password;name=tk.nextToken();
     	    		break;
     	    	}
     	    }
     	}
	

}
