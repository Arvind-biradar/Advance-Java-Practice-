package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/*")
public class filter extends HttpFilter implements Filter {
 

	
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		ServletContext sct =request.getServletContext();// Servlet context is created
		
		Integer hitcounter=(Integer)sct.getAttribute("hitcounter"); // hitconter is globaly created in servletcontext
		if(hitcounter==null)
			hitcounter=0;
		hitcounter++;
		sct.setAttribute("hitcounter",hitcounter);	//value is seting	
		chain.doFilter(request, response);
	}
}
