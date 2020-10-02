package com.hsbc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String mobile=request.getParameter("mobile");
		String problem=request.getParameter("problem");
		
		Cookie[] cookies=request.getCookies();
		if(cookies.length==0){
			Cookie cookie=new Cookie(mobile,problem);
			response.addCookie(cookie);
			request.getRequestDispatcher("/registerForm.jsp").forward(request,response);
			
		}
		else{
			for(Cookie c:cookies){  
				if(c.getName().equals(mobile))
					request.getRequestDispatcher("/confirm.jsp").forward(request,response);
			}
			Cookie cookie=new Cookie(mobile,problem);
			response.addCookie(cookie);
			request.getRequestDispatcher("/registerForm.jsp").forward(request,response);
		}
	
		
	}

}
