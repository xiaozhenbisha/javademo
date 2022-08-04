package com.java.web;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet extends MyGenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		
//		HttpServletRequest httpServletReq = (HttpServletRequest)request;
//		System.out.println(httpServletReq.getRequestURI());
//		System.out.println(httpServletReq.getContextPath());
//		System.out.println(httpServletReq.getContentLength());
		
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		if (username.equals(getServletConfig().getServletContext().getInitParameter("user")) && 
				pwd.equals(getServletConfig().getServletContext().getInitParameter("pwd"))) {
			response.getWriter().println("username and password is right");
			
		}else {
			response.getWriter().println("username and password is wrong");
		}

		
	}


}
