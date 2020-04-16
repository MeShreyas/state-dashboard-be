package com.covid.models;

public class SuspectData {
	
	private int totalCount;
	private int homeQuarantine;
	private int hospitalQuarantine;
	private int compeletedQuarantine;
	public SuspectData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getHomeQuarantine() {
		return homeQuarantine;
	}
	public void setHomeQuarantine(int homeQuarantine) {
		this.homeQuarantine = homeQuarantine;
	}
	public int getHospitalQuarantine() {
		return hospitalQuarantine;
	}
	public void setHospitalQuarantine(int hospitalQuarantine) {
		this.hospitalQuarantine = hospitalQuarantine;
	}
	public int getCompeletedQuarantine() {
		return compeletedQuarantine;
	}
	public void setCompeletedQuarantine(int compeletedQuarantine) {
		this.compeletedQuarantine = compeletedQuarantine;
	}
	

}
