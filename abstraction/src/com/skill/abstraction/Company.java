package com.skill.abstraction;

public  abstract class Company 
{
	private double netsalary = 0.0;
	public Company(double grossSalary)
	{
		calculateNetSalary(grossSalary);
	}
	private void calculateNetSalary(double grossSalary) {
		if (grossSalary >= 5000000) {
			netsalary = grossSalary - (grossSalary * 0.2);
			System.out.println("Net Salary :" + netsalary);
		} else if (grossSalary >= 300000 && grossSalary < 500000) {
			netsalary = grossSalary - (grossSalary * 0.1);
			System.out.println("Net Salary :" + netsalary);
		} else {
			System.out.println("You are not eligible for tax");
		}
	}
}