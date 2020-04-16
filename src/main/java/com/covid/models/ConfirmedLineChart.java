package com.covid.models;

public class ConfirmedLineChart {
	
	private String districtName;
	private String districtCode;
	private int totalConfirmed;
	private int totalRecovered;
	private int totalDeceased;
	private int totalConfirmedDelta;
	private int totalRecoveredDelta;
	private int totalDeceasedDelta;
	private long reportDate;
	private String reportDateString;
	private int id;
	
	public ConfirmedLineChart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public int getTotalConfirmed() {
		return totalConfirmed;
	}

	public void setTotalConfirmed(int totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	public int getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(int totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public int getTotalDeceased() {
		return totalDeceased;
	}

	public void setTotalDeceased(int totalDeceased) {
		this.totalDeceased = totalDeceased;
	}

	public int getTotalConfirmedDelta() {
		return totalConfirmedDelta;
	}

	public void setTotalConfirmedDelta(int totalConfirmedDelta) {
		this.totalConfirmedDelta = totalConfirmedDelta;
	}

	public int getTotalRecoveredDelta() {
		return totalRecoveredDelta;
	}

	public void setTotalRecoveredDelta(int totalRecoveredDelta) {
		this.totalRecoveredDelta = totalRecoveredDelta;
	}

	public int getTotalDeceasedDelta() {
		return totalDeceasedDelta;
	}

	public void setTotalDeceasedDelta(int totalDeceasedDelta) {
		this.totalDeceasedDelta = totalDeceasedDelta;
	}

	public long getReportDate() {
		return reportDate;
	}

	public void setReportDate(long reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportDateString() {
		return reportDateString;
	}

	public void setReportDateString(String reportDateString) {
		this.reportDateString = reportDateString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
