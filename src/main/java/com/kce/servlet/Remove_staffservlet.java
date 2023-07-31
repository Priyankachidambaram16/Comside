package com.kce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kce.dao.Remove_higherDao;
import com.kce.dao.Remove_staffDao;
import com.kce.model.Remove_highermodel;
import com.kce.model.Remove_staffmodel;

/**
 * Servlet implementation class Remove_staff
 */
@WebServlet("/Remove_staffservlet")
public class Remove_staffservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Remove_staffmodel s=new Remove_staffmodel();
		s.setName(request.getParameter("name"));
	
		
		Remove_staffDao sd=new Remove_staffDao();
		boolean result=sd.removeData(s);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(result) {
		pw.print("registered");
		}else {
		pw.print("NotRegistered");
		}
	}

	


}
