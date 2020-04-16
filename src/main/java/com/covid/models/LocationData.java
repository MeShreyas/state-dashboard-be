package com.covid.models;

public class LocationData {
	private String location;
	private int count;
	
	public LocationData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LocationData(String location, int count) {
		super();
		this.location = location;
		this.count = count;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}


