package com.covid.models;

public class TableData implements Comparable<TableData>{

	private String district;
	private int totalCases;
	private int hospitalCases;
	private int deceasedCases;
	private int recoveredCases;

	public TableData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public TableData(String district) {
		super();
		this.district = district;
	}



	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}

	public int getHospitalCases() {
		return hospitalCases;
	}

	public void setHospitalCases(int hospitalCases) {
		this.hospitalCases = hospitalCases;
	}

	public int getDeceasedCases() {
		return deceasedCases;
	}

	public void setDeceasedCases(int deceasedCases) {
		this.deceasedCases = deceasedCases;
	}

	public int getRecoveredCases() {
		return recoveredCases;
	}

	public void setRecoveredCases(int recoveredCases) {
		this.recoveredCases = recoveredCases;
	}



	@Override
	public int compareTo(TableData o) {
		return Integer.compare(this.getTotalCases(),o.getTotalCases());
	}

}
