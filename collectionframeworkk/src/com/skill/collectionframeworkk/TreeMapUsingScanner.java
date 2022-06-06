package com.skill.collectionframeworkk;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapUsingScanner {
	public void employeeData() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Num of Employees");
		int length = sc.nextInt();
		
		TreeMap<Integer,Employee> tm= new TreeMap<Integer,Employee>();
		
		for (int i=0; i<length; i++);
		 System.out.println("Enter ur Employee id");
		 int Empid=sc.nextInt();
		 
		 System.out.println("Enter Ur Name");
		 String empn= sc.next();
		 
		 System.out.println("Enter ur Salary");
		 double empd =sc.nextDouble();
		 
		 System.out.println("Enter ur Company Name");
		 String emps=sc.next();
		 
		 
		 }
	

	public static void main(String[] args) {
		TreeMapUsingScanner tms = new TreeMapUsingScanner ();
		tms.employeeData();

	}

}
