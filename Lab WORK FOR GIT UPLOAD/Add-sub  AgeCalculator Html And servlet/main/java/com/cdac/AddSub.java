package com.cdac;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/f1")
public class AddSub extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	
		
      int Number1 = Integer.parseInt(request.getParameter("Number1"));
		int Number2= Integer.parseInt(request.getParameter("Number2"));
		int sum= Number1+Number2;
		
		int Num1 = Integer.parseInt(request.getParameter("Number1"));
		int Num2= Integer.parseInt(request.getParameter("Number2"));
		int sub = Num1-Num2;
		
		String button1 = request.getParameter("addition");
		String button2 = request.getParameter("substraction");
		String act = request.getParameter("act");

		if(act.equals("addition")) {
		out.println("<html><body>");
		out.println("<h1>Addition : "+ sum +"</h1>");
		out.println("</body></html>");
		}
		else {
			out.println("<html><body>");
			out.println("<h1>Substraction : "+ sub +"</h1>");
			out.println("</body></html>");
		}

		
		
	}



}
