package travel;

public abstract class Travel {

	private String country; 
	private String city; 
	private String travelDate; 
	private String returnDate; 
	private int days;
	private String hotel; 
	private double cost;
	private String travelType;
	private int travelMileage; 
	
	 final int x = 5;
	
	public Travel(String country, String city, String td, String rd, int days, String hotel, double cost, int mileage) {
		setCountry(country);
		setCity(city);
		setTravelDate(td);
		setReturnDate(rd);
		setDays(days);
		setHotel(hotel);	
		setCost(cost);
		setTravelMileage(mileage);
	}

	 void setCountry(String s) { country = s; }
	 String getCountry() { return country; }
	
	 void setCity(String s) { city = s; }
	 String getCity() { return city; }
	
	 void setTravelDate(String s) { travelDate = s; }
	 String getTravelDate() { return travelDate; }
	 
	 void setReturnDate(String s) { returnDate = s; }
	 String getReturnDate() { return returnDate; }
		
	 void setDays(int s) { days = s; }
	 public int getDays() { return days; }
	
	 void setHotel(String s) { hotel = s; }
	 String getHotel() { return hotel; }
	
	 void setCost(double s) { cost = s; }
	 public double getCost() { return cost; }
	 
	 void setTravelType(String s) { travelType = s; }
	 String getTravelType() { return travelType; }
	 
	 void setTravelMileage(int s) { travelMileage = s; }
	 int getTravelMileage() { return travelMileage; }
	 
	 public void print() {
		System.out.println("\nTravelType: " + travelType);
		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		System.out.println("TravelDate: " + travelDate);
		System.out.println("ReturnDate: " + returnDate);	
		System.out.println("Days: " + days);	
		System.out.println("Hotel: " + hotel);
		System.out.println("Cost: " + cost);
		System.out.println("TravelMileage: " + travelMileage);
	}
	 
}
