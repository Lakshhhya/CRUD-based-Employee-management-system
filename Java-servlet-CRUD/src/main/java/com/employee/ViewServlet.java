package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/ViewServlet")

public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");  
        PrintWriter out = res.getWriter();  
        out.println("<a href='index.html'>Add New Employee</a>");
        out.println("<h1>Employees List</h1>");

        List<Employee> list = EmployeeDAO.getAllEmployees();

        out.print("<table border='1' width='80%'");
        out.print(
                "<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
        for (Employee e : list) {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getPassword() + "</td><td>"
                    + e.getEmail() + "</td><td>" + e.getCountry() + "</td><td><a href='EditServlet?id=" + e.getId()
                    + "'>edit</a></td><td><a href='DeleteServlet?id=" + e.getId() + "'>delete</a></td></tr>");
        }
        out.print("</table>");

        out.close();
    }
}