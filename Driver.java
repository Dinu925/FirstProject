package com;

public class Driver {
	
	private int DriverId;
	private String category;
	private String DriverName;
	private double TotalDistance;
	
	public Driver(){
		
	}
	public Driver(int driverId, String category, String driverName, double totalDistance){
	
		this.DriverId = driverId;
		this.category = category;
		this.DriverName = driverName;
		this.TotalDistance = totalDistance;
	}
	public int getDriverId() {
		return DriverId;
	}
	public void setDriverId(int driverId) {
		DriverId = driverId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	public double getTotalDistance() {
		return TotalDistance;
	}
	public void setTotalDistance(double totalDistance) {
		TotalDistance = totalDistance;
	}
	@Override
	public String toString() {
		return "Driver [DriverId=" + DriverId + ", category=" + category + ", DriverName=" + DriverName
				+ ", TotalDistance=" + TotalDistance + "]";
	}
	

}
