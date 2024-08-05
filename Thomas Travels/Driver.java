package com;

public class Driver {
	
	private int driverId;
	private double totalDistance;
	private String category;
	private String driverName;
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public double getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Driver(int driverId, double totalDistance, String category, String driverName) {
		super();
		this.driverId = driverId;
		this.totalDistance = totalDistance;
		this.category = category;
		this.driverName = driverName;
	}
	public Driver(){
	}
	
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", totalDistance=" + totalDistance + ", category=" + category
				+ ", driverName=" + driverName + "]";
	}
	
}
