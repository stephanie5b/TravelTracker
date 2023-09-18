package travel;

import files.*;

public class MyTravel {

	Travel myTravel[];

	public void init(String str) {	
		String line;
		int index=0;
		int numberTravel=0;
		
		ReadTextFile f = new ReadTextFile(str);
		f.open();

		if ((line = f.readline()) != null) { // total entries
			numberTravel = Integer.parseInt(line);
		}		
		
		myTravel = new Travel[numberTravel];
		
		while ((line = f.readline()) != null) {
			String[] info = line.split(",");
			if (info[0].equals("Air") == true)
				myTravel[index++] = new AirTravel(info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9],info[10]);
			else
				myTravel[index++] = new LandTravel(info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9]);
		}
	}
   
   public String printTravel() {   
   String TravelAsText = "";   
      for (Travel travel : myTravel) {
         if(travel.getTravelType() == "Air") {
            TravelAsText = TravelAsText + "\nTravelType: " + travel.getTravelType()
                  + "\nCountry: " + travel.getCountry()
                  + "\nCity: " + travel.getCity()
                  + "\nTravelDate: " + travel.getTravelDate()
                  + "\nReturnDate: " + travel.getReturnDate()
                  + "\nDays: " + travel.getDays()
                  + "\nHotel: " + travel.getHotel()
                  + "\nCost: " + travel.getCost()
                  + "\nTravelMileage: " + travel.getTravelMileage()
                  + "\nAirline: " + ((AirTravel) travel).getAirline()
                  + "\nTravelRefNumber: " + ((AirTravel) travel).getTravelRefNumber() + "\n" + "\n";
        } 
        else {
            TravelAsText = TravelAsText + "TravelType: " + travel.getTravelType()
                  + "\nCountry: " + travel.getCountry()
                  + "\nCity: " + travel.getCity()
                  + "\nTravelDate: " + travel.getTravelDate()
                  + "\nReturnDate: " + travel.getReturnDate()
                  + "\nDays: " + travel.getDays()
                  + "\nHotel: " + travel.getHotel()
                  + "\nCost: " + travel.getCost()
                  + "\nTravelMileage: " + travel.getTravelMileage()
                  + "\nCarType: " + ((LandTravel) travel).getCarType();
                                   
         }
         
       
     }
     return TravelAsText;
  
   }   
    public String printAir() {   
    String AirTravelAsText = ""; 
    String LandTravelAsText = "";  
      for (Travel travel : myTravel) {
         if(travel.getTravelType() == "Air") {
            AirTravelAsText = AirTravelAsText + "TravelType: " + travel.getTravelType()
                  + "\nCountry: " + travel.getCountry()
                  + "\nCity: " + travel.getCity()
                  + "\nTravelDate: " + travel.getTravelDate()
                  + "\nReturnDate: " + travel.getReturnDate()
                  + "\nDays: " + travel.getDays()
                  + "\nHotel: " + travel.getHotel()
                  + "\nCost: " + travel.getCost()
                  + "\nTravelMileage: " + travel.getTravelMileage()
                  + "\nAirline: " + ((AirTravel) travel).getAirline()
                  + "\nTravelRefNumber: " + ((AirTravel) travel).getTravelRefNumber() + "\n" + "\n";
        } else {
        LandTravelAsText = LandTravelAsText + "TravelType: " + travel.getTravelType()
                  + "\nCountry: " + travel.getCountry()
                  + "\nCity: " + travel.getCity()
                  + "\nTravelDate: " + travel.getTravelDate()
                  + "\nReturnDate: " + travel.getReturnDate()
                  + "\nDays: " + travel.getDays()
                  + "\nHotel: " + travel.getHotel()
                  + "\nCost: " + travel.getCost()
                  + "\nTravelMileage: " + travel.getTravelMileage()
                  + "\nCarType: " + ((LandTravel) travel).getCarType()
                  + "\n" + "\n";
             } 

        }
        return AirTravelAsText;
    }
   public String printLand() {   
    String AirTravelAsText = ""; 
    String LandTravelAsText = "";  
      for (Travel travel : myTravel) {
         if(travel.getTravelType() == "Air") {
            AirTravelAsText = AirTravelAsText + "TravelType: " + travel.getTravelType()
                  + "\nCountry: " + travel.getCountry()
                  + "\nCity: " + travel.getCity()
                  + "\nTravelDate: " + travel.getTravelDate()
                  + "\nReturnDate: " + travel.getReturnDate()
                  + "\nDays: " + travel.getDays()
                  + "\nHotel: " + travel.getHotel()
                  + "\nCost: " + travel.getCost()
                  + "\nTravelMileage: " + travel.getTravelMileage()
                  + "\nAirline: " + ((AirTravel) travel).getAirline()
                  + "\nTravelRefNumber: " + ((AirTravel) travel).getTravelRefNumber() + "\n" + "\n";
        } else {
        LandTravelAsText = LandTravelAsText + "TravelType: " + travel.getTravelType()
                  + "\nCountry: " + travel.getCountry()
                  + "\nCity: " + travel.getCity()
                  + "\nTravelDate: " + travel.getTravelDate()
                  + "\nReturnDate: " + travel.getReturnDate()
                  + "\nDays: " + travel.getDays()
                  + "\nHotel: " + travel.getHotel()
                  + "\nCost: " + travel.getCost()
                  + "\nTravelMileage: " + travel.getTravelMileage()
                  + "\nCarType: " + ((LandTravel) travel).getCarType()
                  + "\n" + "\n";
             } 

        }
        return LandTravelAsText;
    }      
      public String TravelDays() {
         String travelDays = "";
         int day = 0;
         
         for(Travel t : myTravel) {
            day = day + t.getDays();
            travelDays = String.valueOf(day);
         }
      return "Total Days: " + travelDays;   
      
       }
       public String TravelCost() {
         String travelCost = "";
         double cost = 0;
         
         for(Travel t : myTravel) {
            cost = cost + t.getCost();
            travelCost = String.valueOf(cost);
         }
      return "Total Cost: " + travelCost;   
      
       }
       public String AirMileage() {
         String airMileage = "";
         int mil = 0;
         
         for(Travel t : myTravel) {
            if(t.getTravelType() == "Air") {
            mil = mil + t.getTravelMileage();
            airMileage = String.valueOf(mil);
            }
         }
      return "Total Air Mileage: " + airMileage;
      }
       public String LandMileage() {
         String landMileage = "";
         int landmil = 0;
         
         for(Travel t : myTravel) {
            if(t.getTravelType() == "Land") {
            landmil = landmil + t.getTravelMileage();
            landMileage = String.valueOf(landmil);
            }
         }
      return "Total Land Mileage: " + landMileage;
      }
   }


