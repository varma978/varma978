package com.skilladdition;
import java.util.Scanner;
public class Addition {
	public void calculateAddition(int a, int b) {
		int c=a+b;
		System.out.println("Result"+"   "+c);
	}
	public static void main(String[] args) {
System.out.println("Main Method Started");
Scanner Sc=new Scanner(System.in);
System.out.println("enter A Value");
int a=Sc.nextInt();
System.out.println("Enter B value");
int b=Sc.nextInt();
Addition a1=new Addition();
a1.calculateAddition(a, b);

	}
	

}
