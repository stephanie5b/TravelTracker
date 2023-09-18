package travel;

public class LandTravel extends Travel {
	String carType;
	
	 final int x = 4;
	
	public LandTravel(String country, String city, String td, String rd, String days, String hotel, String cost, String mileage,String cartype) {
		this(country, city, td, rd, Integer.parseInt(days), hotel, Double.parseDouble(cost), Integer.parseInt(mileage),cartype);
	}
	
	public LandTravel(String country, String city, String td, String rd, int days, String hotel, double cost, int mileage,String cartype) {
		super(country, city, td, rd, days, hotel, cost, mileage);
		setTravelType("Land");
		setCarType(cartype);
	}
	 void setCarType(String s) { carType = s; }
	 String getCarType() { return carType; }

	 public void print() {
		super.print();	
		System.out.println("CarType: " + carType);
	}
}
