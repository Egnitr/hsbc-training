package com.hsbc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.hsbc.web.entity.Emp;
import com.sun.xml.internal.ws.util.Pool.Marshaller;

@WebServlet("/api")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/xml");
		 try {
			 Emp e=new Emp(101,"Abhi","Pune",10000);
			 JAXBContext context=JAXBContext.newInstance(Emp.class);
			 javax.xml.bind.Marshaller marshaller=context.createMarshaller();
			 marshaller.marshal(e,response.getWriter());
			 //JSONObject obj=new JSONObject(e);
			 //response.getwriter().write(obj.toString());
		} catch (JAXBException e) {
			System.out.println(e);
		} 
		 
	}

}
