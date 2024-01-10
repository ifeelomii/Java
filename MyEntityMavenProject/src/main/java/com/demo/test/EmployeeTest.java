package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(104,"Ashish","9876543210",47000);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess1 = sf.openSession();
		Transaction tr = sess1.beginTransaction();
		sess1.save(emp1);
		tr.commit();
		sess1.close();
	}

}
