package com.covid.models;

import java.util.Date;

public class LineData implements Comparable<LineData> {

	private Date reportDate;
	private int totalCases;
	private int totalInHospital;
	private int totalRecovered;
	private int totalDeceased;
	private int deltaCases;
	private int deltaRecovered;
	private int deltaDeceased;

	public LineData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LineData(Date reportDate, int totalCases, int totalInHospital, int totalRecovered, int totalDeceased,
			int deltaCases, int deltaRecovered, int deltaDeceased) {
		super();
		this.reportDate = reportDate;
		this.totalCases = totalCases;
		this.totalInHospital = totalInHospital;
		this.totalRecovered = totalRecovered;
		this.totalDeceased = totalDeceased;
		this.deltaCases = deltaCases;
		this.deltaRecovered = deltaRecovered;
		this.deltaDeceased = deltaDeceased;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public int getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}

	public int getTotalInHospital() {
		return totalInHospital;
	}

	public void setTotalInHospital(int totalInHospital) {
		this.totalInHospital = totalInHospital;
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

	public int getDeltaCases() {
		return deltaCases;
	}

	public void setDeltaCases(int deltaCases) {
		this.deltaCases = deltaCases;
	}

	public int getDeltaRecovered() {
		return deltaRecovered;
	}

	public void setDeltaRecovered(int deltaRecovered) {
		this.deltaRecovered = deltaRecovered;
	}

	public int getDeltaDeceased() {
		return deltaDeceased;
	}

	public void setDeltaDeceased(int deltaDeceased) {
		this.deltaDeceased = deltaDeceased;
	}

	public int compareTo(LineData o) {
		return this.getReportDate().compareTo(o.getReportDate());
	}

}
