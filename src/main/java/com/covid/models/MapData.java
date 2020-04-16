package com.covid.models;

public class MapData {

	private String district;
	private LatLng cordinates;
	private int totalCases;
	private int hospitalCases;
	private int deceasedCases;
	private int recoveredCases;

	public MapData() {
		super();
		// TODO Auto-generated constructor stub
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

	public LatLng getCordinates() {
		return cordinates;
	}

	public void setCordinates(LatLng cordinates) {
		this.cordinates = cordinates;
	}

}
