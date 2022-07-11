package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servlet1 extends HttpServlet {
	
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NewUser nu=new NewUser();
		nu.setUser(request.getParameter("user"));
		nu.setPassword(Integer.parseInt(request.getParameter("pass")));
		nu.setMobile(Integer.parseInt(request.getParameter("mobile")));
		
		
		NewUserDeo nud=new NewUserDeo();
		nud.add(nu);
		PrintWriter pw=response.getWriter();
	    pw.write("Added.....");	}

	

}
