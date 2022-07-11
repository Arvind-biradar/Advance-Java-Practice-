package com.cdac;
import java.time.*;
import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agecal")
public class agecal extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();	
		
		int year=Integer.parseInt(request.getParameter("y"));
		int month=Integer.parseInt(request.getParameter("m"));
		int day=Integer.parseInt(request.getParameter("d"));
		

		
		LocalDate t=LocalDate.of(year,month,day);

		
		
		LocalDate today=LocalDate.now();

		
		
		
	
		int years=Period.between(t,  today).getYears();
		int mont=Period.between(t,  today).getMonths();
		int days=Period.between(t,  today).getDays();
		

		p.write("<h1 > "+years+"years :"+mont+"months :"+days+"days "+" Old"+"</h1>");
		
	}


}
