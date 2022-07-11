package com.cdac;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p=response.getWriter();
	String uname=request.getParameter("user");
	String upass=request.getParameter("pass");
	String mobileno=request.getParameter("mobile");
		String email=request.getParameter("email");
 	
	LoginService logincheck=new LoginService();
    boolean IsValid=logincheck.checkLogin(uname,upass);
    
	   try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","cdac");
//     Statement st=conn.createStatement();
//	         	st.executeQuery("slect ");
PreparedStatement st=conn.prepareStatement("insert into tabuser(username,userpassword,usermobileno,useremail)"
		+ " values(?,?,?,?) ");
//PreparedStatement st=conn.prepareStatement("select * from tabuser where useremail =? ") ;
    	
	    	st.setString(1, uname);
	    	st.setString(2, upass);
	    	st.setString(3, mobileno);
	    	st.setString(4, email);   	
	    	st.executeUpdate();
	    	
//	    	ResultSet rs=st.executeQuery();
//	    	
//	    	while(rs.next()) {
//	    		p.write("I got the Output");
//	           String srk=rs.getString("username");
//	       	p.write("I got the Output");
//	    	}
	    	conn.close();
	    	
	    }
	    catch( Exception e){
	    	e.printStackTrace();
	    		    	
	    }

	if(IsValid) {
		
    	response.sendRedirect("welcome1.html");
		
	}else {
		p.println(IsValid);
		response.sendRedirect("failed1.html");
		

	
	}
	}}
