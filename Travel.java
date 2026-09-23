package com.Service;

import com.Driver;

public class Travel {
	
	public boolean isCarDriver(Driver driver){
		String category = driver.getCategory();
		boolean result = category.equalsIgnoreCase("Car");
		return result;
		 
	 }
	public String retrivedByDriverId(Driver[] drivers, int driverId) {
		 for(Driver driver: drivers) {
			if(driver.getDriverId() == driverId) {
				return "Driver name is: "+ driver.getDriverName() +" Belonging to the category: "+driver.getCategory()+ " travelled : "
						+ driver.getTotalDistance()+" KM so far.";
			}
		 }
		 return "Not Found";
		
	 }
	 public int retriveCountofDriver(Driver [] drivers, String category){
		 int count = 0;
		 for(Driver driver: drivers) {
			 if(driver.getCategory().equalsIgnoreCase(category)) {
				 count++;
			 }
		 }
		return count;
		 
	 }
	public Driver[] retriveDriver(Driver [] drivers, String category){
		 
		 int count = 0;
		 for(Driver driver: drivers) {
			 if(driver.getCategory().equalsIgnoreCase(category)) {
				 count++;
			 }
		 }
		Driver [] result = new Driver[count];
		 int index = 0;
		 for(Driver driver: drivers) {
			 if(driver.getCategory().equalsIgnoreCase(category)) {
				 result[index] = driver;
				 index++;
			 }
		 }
		 
		return result;
		 
	 }
	  public Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers){
		  Driver maxDriver = drivers[0];
		  for(Driver driver: drivers) {
			if(driver.getTotalDistance()>maxDriver.getTotalDistance()) {
				maxDriver = driver;
			}
		  }
		  return maxDriver;	 
		 
	 }
	 
}
