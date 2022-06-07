package com.ecommerce.shopping.test;
import java.util.Scanner;

import com.ecommerce.shopping.payment.Payment;

public class Test {

public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	Payment p=new Payment();
	String userName=null;
	String password=null;
	long cardNumber=0;
	int cvv=0;
	int expiryDate=0;
	String uPID=null;
	int passCode=0;
	

	System.out.println("n for netbanking c for card payment u for upiid");
	char s=Sc.next().charAt(0);

	switch(s)
	{
		case 'n':p.payment(userName, password);
		break;
		case 'c':p.payment(cardNumber, cvv, uPID);
		break;
		case 'u': p.payment(uPID, passCode);
		
	}
	

	}

}
