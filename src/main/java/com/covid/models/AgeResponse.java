package com.covid.models;

public class AgeResponse {
	
	private String ageRange;
	private int count;
	public AgeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgeResponse(String ageRange, int count) {
		super();
		this.ageRange = ageRange;
		this.count = count;
	}
	public String getAgeRange() {
		return ageRange;
	}
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}
