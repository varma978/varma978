package com.skill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet{


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		String Firstname    = req.getParameter("fname");
		String Lastname     = req.getParameter("lname");
		String Email        = req.getParameter("email");
		String Password     =req.getParameter("password");
		String Contact      =req.getParameter("contact");
		String Gender       =req.getParameter("gender");
		String Hobbies []     =req.getParameterValues("Hobbies");
		String City          =req.getParameter("City");
		String Address       =req.getParameter("address");
		
		
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		pw.println("fname::"+Firstname+"</br>");
		pw.println("email::"+Email+"</br>");
		pw.println("password::"+Password+"</br>");
		pw.println("contact::"+Contact+"</br>");
		pw.println("gender::"+Gender+"</br>");
		for(String h:Hobbies) {
			pw.println("Hobbies::"+h+"</br>");
			}
		pw.println("City::"+City+"</br>");
		pw.println("address::"+Address+"</br>");
		pw.println("</body></html>");
		}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
doGet(req,res);
}
}
