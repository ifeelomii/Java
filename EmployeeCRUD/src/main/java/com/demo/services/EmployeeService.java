package com.demo.services;
import java.util.ArrayList;
import java.util.List;

import com.demo.dao.EmployeeDao;
import com.demo.dao.IEmployeeDao;
import com.demo.model.Employee;

public class EmployeeService implements IEmployeeService {
	private static IEmployeeDao eDao; 
	private static List<Employee> empList;	
		
	@Override
	public List<Employee> DisplayAll() {
		eDao = new EmployeeDao();
		empList = new ArrayList<Employee>();
		empList = eDao.DisplayEmp();
		return empList;
	}
}
