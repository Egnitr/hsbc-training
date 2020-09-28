import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

    public Calculator() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		
		if(n1 != "" && n2 != "") {
			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(n2);
			
			int ans=0;
			String ans1 = "";
			
			if(request.getParameter("Add") != null) {
				ans = num1 + num2;
				ans1 = Integer.toString(ans);
				out.print("<h1 style=\" color: blue\">" + ans1 + "</h1>");
			}
			else if(request.getParameter("Subtract") != null) {
				ans = num1 - num2;
				ans1 = Integer.toString(ans);
				out.print("<h1 style=\" color: blue\">" + ans1 + "</h1>");
			}
			if(request.getParameter("Multiply") != null) {
				ans = num1*num2;
				ans1 = Integer.toString(ans);
				out.print("<h1 style=\" color: blue\">" + ans1 + "</h1>");
			}
			if(request.getParameter("Divide") != null) {
				if(num2 == 0) {
					out.print("Second value cannot be zero");
				}
				else {
					ans = num1/num2;
					ans1 = Integer.toString(ans);
					out.print("<h1 style=\" color: blue\">" + ans1 + "</h1>");
				}
			}
		}	
		else
			out.print("Enter values in textBox");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}