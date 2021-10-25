package FlightReservation.flightreservation;


public class  flightinfo {
	private String flightNumber ,  travelOrigin ,  travelDestination,   travelDate , travelTime  ,   seatAvailable ,  travelClass;
	double fare;
	double travelDuration;
	
	
	public  flightinfo(
			String flightNumber,
			String travelOrigin,
			String travelDestination,
			String travelDate,
			String travelTime,
			double travelDuration,
			double fare,
			String seatAvailable,
			String travelClass
			
			)
	{
		super();
		this.flightNumber= flightNumber;
		this.travelOrigin= travelOrigin;
		this.travelDestination= travelDestination;
		this.travelDate= travelDate;
		this.travelTime= travelTime;
		this.travelDuration= travelDuration;
		this.seatAvailable= seatAvailable;
		this.travelClass= travelClass;
		this.fare= fare;
		
	}
	
	void undoflight(String f1)
	{
		
	}



	//getters
	public String getflightNumber()
	{
		return flightNumber;
	}
	
	public String gettravelOrigin()
	{
		return travelOrigin;
	}
	

	public String gettravelDestination()
	{
		return travelDestination;
	}

	
	public String gettravelDate()
	{
		return travelDate;
	}
	
	public String gettravelTime()
	{
		return travelTime;
	}
	
	
	public double gettravelDuration()
	{
		return travelDuration;
	}
	
	
	public String getseatAvailable()
	{
		return seatAvailable;
	}
	
	
	public String gettravelClass()
	{
		return travelClass;
	}
	
	public double getfare()
	{
		return fare;
	}
	
	
	//setters
	
	public void setflightNumber(String flightNumber)
	{
		this.flightNumber= flightNumber;
	}
	
	public void settravelOrigin(String travelOrigin)
	{
		this.travelOrigin= travelOrigin;
	}
	
	
	public void settravelDestination(String travelDestination)
	{
		this.travelDestination= travelDestination;
	}

	public void settravelDate(String travelDate)
	{
		this.travelDate= travelDate;
	}
	
	public void settravelTime(String travelTime)
	{
		this.travelTime= travelTime;
	}
	
	
	public void setseatAvailable(String seatAvailable)
	{
		this.seatAvailable= seatAvailable;
	}
	
	public void settravelClass(String travelClass)
	{
		this.travelClass= travelClass;
	}
	
	public void setfare(double fare)
	{
		this.fare= fare;
	}
	
	public void settravelDuration(double travelDuration)
	{
		this.travelDuration= travelDuration;
	}
	
}



