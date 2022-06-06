package com.skill.abstraction;
import java.util.Scanner;
public class Employee extends Company{
    public Employee(double grossSalary) {
		   super(grossSalary);
	}
  public static void main(String[] args) {
	  Scanner Sc=new Scanner(System.in);
	  System.out.println("Enter Salary");
	  Employee e = new Employee(Sc.nextDouble());
}  
}
