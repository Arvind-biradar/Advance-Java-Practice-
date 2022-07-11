package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/servlet")
public class TatkalTicket extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p=response.getWriter();
		ServletConfig c=getServletConfig();
//		
//		int StarTime=Integer.parseInt(c.getInitParameter("StartTime"));
//		System.out.println(StarTime);
//		LocalTime time=LocalTime.now();
//		int RightNowTime=time.getHour();
//		if(RightNowTime>StarTime) {
//			p.write("<h1>OPEN Now..... can login</h1>");
//		}else
//		{
//			p.write("<h1>Closed Can't... login</h1>");	
//		}
//	
		
		/*Local Time 10:30*/
		
		LocalTime StarTime1=LocalTime.parse(c.getInitParameter("StartTime"));
		LocalTime StarTime2=LocalTime.parse(c.getInitParameter("EndTime"));
		System.out.println(StarTime1);
		LocalTime time=LocalTime.now();
	   System.out.println(time);
		boolean time1=time.isAfter(StarTime1);
		boolean time2=time.isBefore(StarTime2);
		if(time1 && time2) {
			p.write("<h1>OPEN Now..... can login</h1>");
		}else
		{
			p.write("<h1>Closed Can't... login</h1>");	
		}
		
		
	}
		

}
