package com.ecommerce.shopping.payment;
import java.util.Scanner;
public class Payment {
	Scanner sc=new Scanner(System.in);
	public String payment(String userName,String password)
	{
		System.out.println("Enter User Name");
		userName=sc.next();
		System.out.println("Enter User Name");
		password=sc.next();
		String result="NetBanking completed loggin";
		System.out.println(result);
		return result;
	}
		public String payment(long cardNumber,int cvv,String expiryDate)
		{
			System.out.println("Enter Card Number");
			cardNumber=sc.nextLong();
			System.out.println("Enter Cvv");
			cvv=sc.nextInt();
			System.out.println("Enter Expiry Date");
			expiryDate=sc.next();
			String result="NetBanking completed loggin";
			System.out.println(result);
			return result;
		}
		public String payment(String uPID,int passCode) {
			System.out.println("Enter uPID");
			uPID=sc.next();
			System.out.println("Enter PassCode");
			passCode=sc.nextInt();
			String result="Net Banking Completed login";
			System.out.println(result);
					return result;
		
		}
		
		
		
	}
	

