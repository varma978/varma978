package com.skill.jdbc;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) throws SQLException {
Student s= new Student();
Scanner sc =new Scanner(System.in);
System.out.println("enter Student name");
String student_name = sc.next();
System.out.println("enter Student Email id");
String student_email=sc.next();
System.out.println("enter Student contact num");
String student_contact=sc.next();
System.out.println("enter adress");
String student_address=sc.next();
s.studentInsert(student_name, student_email, student_contact, student_address);

	}
}
