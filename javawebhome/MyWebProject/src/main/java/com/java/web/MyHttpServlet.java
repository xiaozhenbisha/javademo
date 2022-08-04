package com.java.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends MyGenericServlet {
	private static final long serialVersionUID = 1l; 

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 HttpServletRequest hreq= (HttpServletRequest)req;
		 HttpServletResponse hres= (HttpServletResponse)res;
		 this.service(hreq, hres);
	}
	
	public void service(HttpServletRequest hreq, HttpServletResponse hres) throws ServletException, IOException {
		
		 String method = hreq.getMethod();
		 if (method.equalsIgnoreCase("GET")) {
			doGet(hreq,hres);
		}else if (method.equalsIgnoreCase("POST")) {
			doPost(hreq,hres);
		}
	}

	private void doPost(HttpServletRequest hreq, HttpServletResponse hres) {
		// TODO Auto-generated method stub
		
	}

	private void doGet(HttpServletRequest hreq, HttpServletResponse hres) {
		// TODO Auto-generated method stub
		
	}

}
