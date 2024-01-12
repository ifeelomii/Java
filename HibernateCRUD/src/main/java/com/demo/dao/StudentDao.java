package com.demo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class StudentDao implements IStudentDao {

	static SessionFactory sf = new Configuration().configure().buildSessionFactory();

	/*
	static SessionFactory getMySessionFactory() {
		if (sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
	*/

	@Override
	public List<Student> GetAllStudentDao() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("from std_tbl");
		List<Student> list = query.getResultList();
		tr.commit();
		session.close();
		return list;
	}

	@Override
	public boolean AddNewStudentDao(Student std) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(std);
		tr.commit();
		return true;
	}

	@Override
	public Student GetStudentByIdDao(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student std = session.get(Student.class, id);
		tr.commit();
		session.close();
		return std;
	}

	@Override
	public boolean UpdateStudentDao(Student std) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student student = session.get(Student.class, std.getStdid());
		if(student!=null) {
			session.merge(std);
			tr.commit();
			session.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean DeleteStudentDao(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student student = session.get(Student.class, id);
		if(student!=null) {
			session.delete(student);
			tr.commit();
			session.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean CloseStudentDao() {
		sf.close();
		return true;
	}

	@Override
	public List<Student> SortStudentByIdDao() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("from std_tbl s order by s.stdid desc");
		List<Student> list = query.getResultList();
		tr.commit();
		session.close();
		return list;
	}

	@Override
	public List<Student> SortStudentByNameDao() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("from std_tbl std order by std.std_name select desc");
		List<Student> list = query.getResultList();
		tr.commit();
		session.close();
		return list;
	}

	@Override
	public List<Student> SortStudentByMarksDao() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("from std_tbl std order by std.std_marks select desc");
		List<Student> list = query.getResultList();
		tr.commit();
		session.close();
		return list;
	}

}
