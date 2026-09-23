package com.Inherit;

import com.Driver;
import com.Service.Travel;

public class TestDriver {

	public static void main(String[] args) {
		
		Driver driver1 = new Driver(1, "Car", "Raghu", 295.5);
        System.out.println(driver1);
        
        Travel travel = new Travel();
       System.out.println(travel.isCarDriver(driver1)); 
       
       Driver[] drivers = new Driver[6];
       drivers[0] = new Driver(2, "Tempo", "Hari",275.9);
       drivers[1] = new Driver(3, "Bus", "Ravi",387.6);
       drivers[2] = new Driver(4, "Auto", "Eswar",497.0);
       drivers[3] = new Driver(5, "Toofan", "Vasu",275.9);
       drivers[4] = new Driver(6, "Car", "Ramana",126.6);
       drivers[5] = new Driver(6, "Car", "Raju",147.6);
      
       
      String message = travel.retrivedByDriverId(drivers, 2);
      System.out.println(message);
      
     int count = travel.retriveCountofDriver(drivers, "Car");
      System.out.println(count);
      
      Driver[] resultDrivers = travel.retriveDriver(drivers, "Car");
      for(Driver driver: resultDrivers) {
    	System.out.println(driver);  
      }
      System.out.println("=======================================");
      Driver driver = travel.retriveMaximumDistanceTravelledDriver(drivers);
      System.out.println(driver);
      
	}

}
