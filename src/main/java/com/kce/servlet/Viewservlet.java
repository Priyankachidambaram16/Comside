package com.kce.servlet;


import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.kce.dao.RegisterDao1;
import com.kce.model.Registercomplainsmodel;  
@WebServlet("/Viewservlet")  
public class Viewservlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='index.html'>Home</a>");  
        
        List<Registercomplainsmodel> list=RegisterDao1. getAllDetails();  
          
        out.print("<!DOCTYPE html>\r\n"
        		+ "<html lang=\"en\">\r\n"
        		+ "<head>\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">"
        		+ "<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n"
        		+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n"
        		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>"
        		+ "    <meta charset=\"UTF-8\">\r\n"
        		+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
        		+ "    <meta name=\"viewport\" content=\"width=, initial-scale=1.0\">\r\n"
        		+ "    <title>Document</title>\r\n"
        		+ "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n"
        		+ "    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n"
        		+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n"
        		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n"
        		+ "    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n"
        		+ "</head>\r\n"
        		+ "<body><section class=\"intro\">\r\n"
        		+ "        <div class=\"bg-image h-100\" style=\"background-image: url('assets/img/kcepro.jpg');\">\r\n"
        		+ "          <div class=\"mask d-flex align-items-center h-100\" style=\"background-color: rgba(0,0,0,.25);\">\r\n"
        		+ "            <div class=\"container\">\r\n"
        		+ "              <div class=\"row justify-content-center\">\r\n"
        		+ "                <div class=\"col-12\">\r\n"
        		+ "                  <div class=\"card bg-dark shadow-2-strong\">\r\n"
        		+ "                    <div class=\"card-body\">\r\n"
        		+ "                      <div class=\"table-responsive\">\r\n"
        		+ "                        <table class=\"table table-dark table-borderless mb-0\">\r\n"
        		+ "                          <thead>\r\n"
        		+ "                            <tr>\r\n"
        		+ "                              <th scope=\"col\">Name</th>\r\n"
        		+ "                              <th scope=\"col\">Address</th>\r\n"
        		+ "                              <th scope=\"col\">Subject</th>\r\n"
        		+ "                              <th scope=\"col\">Complains</th>\r\n"
        		+ "                             \r\n"
        		+ "                            </tr>\r\n"
        		+ "                          </thead>\r\n"
        		+ "                          <tbody>");  
         
       for(Registercomplainsmodel r:list) {
    	   out.print("<tr> <td>"+r.getName()+"</td><td>"+r.getEmail()+"</td><td>"+r.getSubject()+"</td><td>"+r.getComplains()+"</td></td><td><a href='deleteServlet?name="+r.getName()+"'>Delete</a></td></tr>");
       }
     out.print(" </tbody>\r\n"
     		+ "                        </table>\r\n"
     		+ "                      </div>\r\n"
     		+ "                    </div>\r\n"
     		+ "                  </div>\r\n"
     		+ "                </div>\r\n"
     		+ "              </div>\r\n"
     		+ "            </div>\r\n"
     		+ "          </div>\r\n"
     		+ "        </div>\r\n"
     		+ "      </section>\r\n"
     		+ "   \r\n"
     		+ "</body>\r\n"
     		+ "</html>\r\n"
     		+ "\r\n"
     		+ "");
        out.close();  
    }  
}  