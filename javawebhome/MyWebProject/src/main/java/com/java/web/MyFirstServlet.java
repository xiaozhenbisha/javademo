package com.java.web;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFirstServlet implements Servlet{

	private ServletContext servletContext; 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//String value = config.getInitParameter("user");
		//System.out.println(value);
		/**
		 * Enumeration<String> eu = config.getInitParameterNames();
		while (eu.hasMoreElements()) {
			String string = (String) eu.nextElement();
			String value = config.getInitParameter(string);
			System.out.println(value);
		}
		 */
		this.servletContext = config.getServletContext();
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//这句话实现了向servletContext对象的属性空间存入了一个键值对
		//servletContext.setAttribute("qqqq","112222");
		//res.getWriter().print(servletContext.getInitParameter("user"));
		Properties pro = new Properties();
		String aaaRealPath = servletContext.getRealPath("aaa.properties");
		pro.load(new FileReader(aaaRealPath));
		System.out.println(pro.getProperty("user"));
		System.out.println(pro.getProperty("pwd"));
	}

}
