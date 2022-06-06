package com.skill.jdbc.select;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter i ");
		int i=sc.nextInt();
		
		CustomerSelect cs= new CustomerSelect();
		cs.customerSelect(i);

	}

}
