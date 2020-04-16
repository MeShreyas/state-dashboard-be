package com.covid.models;

//@Entity
public class SuspectCase {

//	@Id
//	@GeneratedValue
	private int id;
	private int totalSuspects;
	private int hospitalQuarantine;
	private int homeQuarantine;
	private int completedQuarantine;

	public SuspectCase() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalSuspects() {
		return totalSuspects;
	}

	public void setTotalSuspects(int totalSuspects) {
		this.totalSuspects = totalSuspects;
	}

	public int getHospitalQuarantine() {
		return hospitalQuarantine;
	}

	public void setHospitalQuarantine(int hospitalQuarantine) {
		this.hospitalQuarantine = hospitalQuarantine;
	}

	public int getHomeQuarantine() {
		return homeQuarantine;
	}

	public void setHomeQuarantine(int homeQuarantine) {
		this.homeQuarantine = homeQuarantine;
	}

	public int getCompletedQuarantine() {
		return completedQuarantine;
	}

	public void setCompletedQuarantine(int completedQuarantine) {
		this.completedQuarantine = completedQuarantine;
	}
	
	

}
