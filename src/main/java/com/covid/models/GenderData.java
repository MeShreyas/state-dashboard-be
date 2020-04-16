package com.covid.models;

public class GenderData {
	private String gender;
	private int count;
	public GenderData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public GenderData(String gender, int count) {
		super();
		this.gender = gender;
		this.count = count;
	}


	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}


