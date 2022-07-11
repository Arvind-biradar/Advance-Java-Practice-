package com.cdac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;


@WebServlet("/login2")
public class login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p=response.getWriter();
	String uname=request.getParameter("user");
	String upass=request.getParameter("pass");
	
	LoginService logincheck=new LoginService();
    boolean IsValid=logincheck.checkLogin(uname,upass);
    
    
    
	   try {
	    	Class.forName("com.mysql.cj.jdbc.driver");
	    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","cdac");
//	     java.sql.Statement st=conn.createStatement();
	     
	  	
PreparedStatement st=conn.prepareStatement("insert into t(username,userpass) values(?,?) ");
//	    	
//	    	((PreparedStatement) st).setString(1, uname);
//	    	((PreparedStatement) st).setString(2, upass);
//	    	
	    	String query="insert into tabuser(username,userpass,usermobileno,useremail)"
	     		+ " values(uname,upass,mobileno,email) ";
	    	
	    	
	    	st.executeUpdate(query);
	    	
	    	conn.close();
	    	
	    }
	    catch( Exception e){
	    	e.printStackTrace();
	    	
	    	
	    }
	
	if(IsValid) {
		//p.write("Login Success....");
		if(request.getParameter("rememberMe") != null) {
		Cookie c1=new Cookie("unam",uname);  // cookies are created
		c1.setMaxAge(60*60);
		Cookie c2=new Cookie("upas",upass);
		
		c2.setMaxAge(60*60);
		response.addCookie(c1);
		response.addCookie(c2);}
		response.sendRedirect("welcome.html");
	}else {
		response.sendRedirect("failed.html");
		//p.write("Login Failed....");}
}

	}}
