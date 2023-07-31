package com.kce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kce.dao.Remove_higherDao;

import com.kce.model.Remove_highermodel;

/**
 * Servlet implementation class Remove_higherservlet
 */
@WebServlet("/Remove_higherservlet")
public class Remove_higherservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Remove_highermodel s=new Remove_highermodel ();
		s.setName(request.getParameter("name"));
	
		
		Remove_higherDao sd=new Remove_higherDao();
		boolean result=sd.removeData(s);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(result) {
			RequestDispatcher r=request.getRequestDispatcher("Admin.html");
			r.forward(request, response);
		}else {
		pw.print("<script>alert('not register');location='remove_higher.html';</script>");
		}
	}



}
