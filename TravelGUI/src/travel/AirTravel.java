package travel;

public class AirTravel extends Travel {
	
	private String airline; 
	private String travelRefNumber; 
	
	public AirTravel(String country, String city, String td, String rd, String days, String airline, String hotel, String prn, String cost, String mileage) {
		this(country, city, td, rd, Integer.parseInt(days), airline, hotel, prn, Double.parseDouble(cost), Integer.parseInt(mileage));
	}
	
	public AirTravel(String country, String city, String td, String rd, int days, String airline, String hotel, String prn, double cost, int mileage) {
		super(country,  city,  td,  rd,  days,  hotel,  cost, mileage);
		setTravelType("Air");
		setAirline(airline);
		setTravelRefNumber(prn);
	}
	void setAirline(String s) { airline = s; }
	String getAirline() { return airline; }
	 
	void setTravelRefNumber(String s) { travelRefNumber = s; }
	String getTravelRefNumber() { return travelRefNumber; }

	 public void print() {
		super.print();
		System.out.println("Airline: " + airline);		
		System.out.println("TravelRefNumber: " + travelRefNumber);
	}
}
