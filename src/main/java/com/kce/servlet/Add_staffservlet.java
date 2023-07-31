package com.kce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kce.dao.Add_higherDao;
import com.kce.dao.Add_staffDao;
import com.kce.model.Add_highermodel;
import com.kce.model.Add_staffmodel;

/**
 * Servlet implementation class Add_staffservlet
 */
@WebServlet("/Add_staffservlet")
public class Add_staffservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Add_staffmodel s=new Add_staffmodel();
		s.setName(request.getParameter("name"));
		s.setPassword(request.getParameter("password"));
		System.out.println(s.getName());
		Add_staffDao sd=new Add_staffDao();
		boolean result=sd.insertData(s);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(result) {
		pw.print("registered");
		}else {
		pw.print("NotRegistered");
		}
	}

}
