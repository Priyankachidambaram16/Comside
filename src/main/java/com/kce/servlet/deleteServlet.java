package com.kce.servlet;

import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.kce.dao.RegisterDao1;  
@WebServlet("/deleteServlet")  
public class deleteServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String name=request.getParameter("name");  
        
        RegisterDao1.delete(name);  
        response.sendRedirect("Viewservlet");  
    }  
}  