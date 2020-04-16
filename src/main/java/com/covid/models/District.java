package com.covid.models;

public class District {

	private String name;
	private String code;
	private long lat;
	private long lng;
	
	public District(String name, String code, long lat, long lng) {
		super();
		this.name = name;
		this.code = code;
		this.lat = lat;
		this.lng = lng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getLat() {
		return lat;
	}

	public void setLat(long lat) {
		this.lat = lat;
	}

	public long getLng() {
		return lng;
	}

	public void setLng(long lng) {
		this.lng = lng;
	}
	
	
}
