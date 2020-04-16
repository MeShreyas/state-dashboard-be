package com.covid.models;

public class AgeData {
	private float age;
	private int count;

	public AgeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeData(float age, int count) {
		super();
		this.age = age;
		this.count = count;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
