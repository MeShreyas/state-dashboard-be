package com.covid.models;

public class CardData {

	private String status;
	private int count;
	

	public CardData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardData(String status, int count) {
		super();
		this.status = status;
		this.count = count;
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	

}
