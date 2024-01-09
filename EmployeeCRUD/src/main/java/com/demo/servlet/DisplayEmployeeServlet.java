package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.services.EmployeeService;
import com.demo.services.IEmployeeService;


@WebServlet("/ShowEmployee")
public class DisplayEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DisplayEmployeeServlet() {
        super();
        IEmployeeService esrc = new EmployeeService();
        List<Employee> eList = esrc.DisplayAll();
        for (Employee emp : eList) {
			System.out.println(emp);
		}
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IEmployeeService esrc = new EmployeeService();
	    List<Employee> eList = esrc.DisplayAll();
	    request.setAttribute("eList", eList);    
	    RequestDispatcher rd = request.getRequestDispatcher("DisplayAll.jsp");
	    rd.forward(request, response);
	}
		
}
