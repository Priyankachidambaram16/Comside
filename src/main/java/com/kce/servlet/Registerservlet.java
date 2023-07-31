package com.kce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kce.dao.Add_higherDao;
import com.kce.dao.RegisterDao;
import com.kce.model.Add_highermodel;
import com.kce.model.Registermodel;

/**
 * Servlet implementation class Registerservlet
 */
@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Registermodel s=new Registermodel();
		PrintWriter p=response.getWriter();
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		s.setSubject(request.getParameter("subject"));
		s.setComplains(request.getParameter("complains"));
		RegisterDao sd=new RegisterDao();
		boolean result=sd.insertData(s);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(result) {
			RequestDispatcher r=request.getRequestDispatcher("publiclogin.html");
			r.forward(request, response);
	//	pw.print("registered");
		}else {
			p.println("<script>alert('not registered');location='RegisterComplain.html");
		pw.print("NotRegistered");
		}
	}


}
