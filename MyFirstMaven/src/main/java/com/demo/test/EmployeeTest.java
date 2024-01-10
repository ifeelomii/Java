package com.demo.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Anurag","anurag@gmail.com", "9156628812");
		Employee emp2 = new Employee(102,"Omkar","omkar@gmail.com", "9156628812");
		Employee emp3 = new Employee(103,"Nilesh","nilesh@gmail.com", "9156628812");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		tr.commit();
		session.close();
	}

}
