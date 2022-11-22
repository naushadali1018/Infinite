package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("Alllink.html").include(request, response);
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		if(password.equals("Naushad12345") && name.equals("Naushad1030")){
		out.print("Welcome, "+name);
		HttpSession session=request.getSession();
		session.setAttribute("Naushad1030",name);
		}
		else{
			out.print("Sorry, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
		
	}

}
