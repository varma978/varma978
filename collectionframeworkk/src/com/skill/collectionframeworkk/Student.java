package com.skill.collectionframeworkk;

public class Student {
	private String name;
	private int rollNum;
	private double feez;
	public Student(String name, int rollNum, double feez) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.feez = feez;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public double getFeez() {
		return feez;
	}
	public void setFeez(double feez) {
		this.feez = feez;
	}
	
	
	

}
