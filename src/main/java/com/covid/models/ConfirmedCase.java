package com.covid.models;

import java.util.Date;

//@Entity
public class ConfirmedCase {

//	@Id
//	@GeneratedValue
	private int id;
	private String caseId;
	private String gender;
	private int age;
	private String district;
	private String locality;
	private Date reportedOn;
	private String status;
	
	public ConfirmedCase() {
		super();
	}
	
	public ConfirmedCase(int id, String caseId, String gender, int age, String district, String locality,
			Date reportedOn, String status) {
		super();
		this.id = id;
		this.caseId = caseId;
		this.gender = gender;
		this.age = age;
		this.district = district;
		this.locality = locality;
		this.reportedOn = reportedOn;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public Date getReportedOn() {
		return reportedOn;
	}
	public void setReportedOn(Date reportedOn) {
		this.reportedOn = reportedOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
