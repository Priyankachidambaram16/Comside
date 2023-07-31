package com.kce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kce.dao.Add_higherDao;
import com.kce.model.Add_highermodel;

/**
 * Servlet implementation class Add_higherservlet
 */
@WebServlet("/Add_higherservlet")
public class Add_higherservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Add_highermodel s=new Add_highermodel();
		s.setName(request.getParameter("name"));
		s.setPassword(request.getParameter("password"));
		
		Add_higherDao sd=new Add_higherDao();
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
