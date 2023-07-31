<%@page import="com.kce.dao.RegisterDao1"%>
<%@page import="com.kce.model.Registermodel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body><section class="intro">
        <div class="bg-image h-100" style="background-image: url('assets/img/kcepro.jpg');">
          <div class="mask d-flex align-items-center h-100" style="background-color: rgba(0,0,0,.25);">
            <div class="container">
              <div class="row justify-content-center">
                <div class="col-12">
                  <div class="card bg-dark shadow-2-strong">
                    <div class="card-body">
                      <div class="table-responsive">
                        <table class="table table-dark table-borderless mb-0">
                          <thead>
                            <tr>
                              <th scope="col">Name</th>
                              <th scope="col">Address</th>
                              <th scope="col">Subject</th>
                              <th scope="col">Complains</th>
                             
                            </tr>
                          </thead>
                          <tbody>
                                <%
                                ArrayList<Registermodel> users = new RegisterDao1().getAllDetails();
                                    for(int i=0; i<users.size();i++){%>
                                        <tr>
                                            <td><%= users.get(i).getName()%></td>
                                          <td><%= users.get(i).getEmail() %></td>
                                            <td><%= users.get(i).getSubject()%></td>
                                            <td><%= users.get(i).getComplains()%></td>
                                            <td><a href="Delete?name=<%=users.get(i).getName() %>">delete</a></td>
                                            <td><a href="EditServlet?name=<%=users.get(i).getName() %>">update</a></td>

                                           
                                        </td>
                                        </tr>
                                      <%}%>
                                 </tbody>
                        </table>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
   
</body>
</html>

