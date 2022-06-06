package com.skill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDetails {
	public static void main(String[] args) throws SQLException {
	int customer_id=201;
	String customer_name="name3";
	String customer_email="name3@gmail.com";
	String customer_contact="678678968";
	String customer_address="hyd";
		//step 1 load Driver Class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step2 create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			//step 3 prepare query
		String CustomerInsert="insert into student_details(student_name , student_email ,student_contact , student_address)   values ('"+customer_name+"','"+customer_email+"','"+customer_contact+"','"+customer_address+"')";
		//prepare statement
		Statement st=con.createStatement();
		//execute statement
		int i=st.executeUpdate(CustomerInsert);
		//step  processing query
		if(i>0)
			System.out.println("table is created");
		else
			System.out.println("table is not created");
		//closing connections
		st.close();
	con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
