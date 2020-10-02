package com.hsbc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String mode=request.getParameter("mode");
		String name=getServletConfig().getInitParameter("name");
		String driver=getServletContext().getInitParameter("driver");
		out.print("<h1>This is Servlet S1</h1>");
		out.print("<h1>Name"+name+"</h1>");
		out.print("<h1>Driver:"+driver+"</h1>");
		switch(mode) {
		case "forward":
			request.getRequestDispatcher("/s2").forward(request,response);
			break;
		case "include":
			RequestDispatcher rd1=request.getRequestDispatcher("/s3");
			rd1.include(request,response);
			break;
		case "redirect":
			response.sendRedirect("http://www.google.co.in");
			break;
		default:
			out.print("<h2>Not a valid Input Mode</h2>");
		}
	}

}
