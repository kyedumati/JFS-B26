package com.jfs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jfs.service.FirstService;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		System.out.println("username entered by user is "+username);
		System.out.println("password entered by user is "+password);
		boolean isValidUser=new FirstService().isValidUser(username, password);
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		//response.setContentType("application/json");
		
		if(isValidUser) {
			
			out.println("<h2 style='color:green'>Served at: first page testing Login is successful</h2>");
			//response.getWriter().append("<h2 style='color:green'>Served at: first page testing Login is successful</h2> ");//.append(request.getContextPath());
		}
		else {
			//response.getWriter().append("<h2 style='color:red'>Served at: first page testing login failed </h2>");//.append(request.getContextPath());
			out.println("<h2 style='color:red'>Served at: first page testing Login is failed</h2>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
