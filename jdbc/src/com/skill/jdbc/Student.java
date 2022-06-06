package com.skill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
public void studentInsert(String student_name, String student_email,String student_contact,String student_address) throws SQLException {
	//step 1 load driver class
	try {
		Class.forName( "com.mysql.cj.jdbc.Driver");
		//step2 create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		//step3 prepare and execute query
		String studentInsert="Insert into student_details(student_name,student_email,student_contact,student_address) values ('"+student_name+"','"+student_email+"','"+student_contact+"','"+student_address+"')";
		Statement st=con.createStatement();
		int i=st.executeUpdate(studentInsert);
		//step4 processing queries
		if(i>0)
			System.out.println("table is inserted");
		else
			System.out.println("table is not inserted");
		//step5 closing connections
		st.close();
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
