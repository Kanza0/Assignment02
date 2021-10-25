package FlightReservation.flightreservation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder; 


public class ArrayListdetails {
	List<flightinfo> list =  new ArrayList<flightinfo>();
	
	public List<flightinfo> getArray()
	{
	//	CSVParser csvp= new CSVParserBuilder().withSeparator('|').build();
		
	/*	File dir= new File(
				"C:\\Users\\pc\\eclipse-workspace\\FlightReservation\\flightreservation");
				File[] file= dir.listFiles();
				
	for (File f :file) {
	*/	try {
		//	CSVReader csvr = new CSVReaderBuilder(new FileReader(f.getAbsolutePath())).withCSVParser(csvp).withSkipLines(1).build();
			
			File f=new File("Book1.txt");
			 FileReader fw= new FileReader(f);
	     	    BufferedReader bf=new BufferedReader(fw);
	     	    String line;
	     	    while((line=bf.readLine())!=null)
	     	    {
			
	     	  System.out.println(line);
	     	    	StringTokenizer tk=new StringTokenizer(line,"|");
	     	    	flightinfo fd= new flightinfo(tk.nextToken(),tk.nextToken(),tk.nextToken(), tk.nextToken(),
	     	    			tk.nextToken(), Double.parseDouble(tk.nextToken()),Double.parseDouble(tk.nextToken()),tk.nextToken(),tk.nextToken());
	    				list.add(fd);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	
	
	}
	
	
	

}
