package com.hsbc.web;
import java.io.*;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ProcessInput extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		
		String empId=req.getParameter("empId");
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		String salary=req.getParameter("salary");
		if (empId.equals(name)) {
			out.print("<h1> Emp Registered with the given details </h1>");
			out.print("<h2>EmpId :"+empId+"</h2>");
			out.print("<h1>Name :"+name+ "</h1>");
			out.print("<h1>City :" +city+ "</h1>");
			out.print("<h1>Salary :"+salary+ " </h1>");
		}
		else {
			out.print("Login failed");
			out.print("<a href=\"emp_form.html\"></a>");
		}
		
	}
}
