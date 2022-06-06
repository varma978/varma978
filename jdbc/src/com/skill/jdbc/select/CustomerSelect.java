
package com.skill.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerSelect {

	public void customerSelect(int i) throws SQLException {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String sc= "select * from student_details where student_id='"+i+"'";
			Statement st= con.createStatement();
			
			ResultSet rs=st.executeQuery(sc);
			
			while(rs.next())
			{
				System.out.println(rs.getInt("student_id")+" "+rs.getString("student_name")+" "+rs.getString("student_email")+" "+rs.getString("student_contact")+" "+rs.getString("student_address"));
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	


}
