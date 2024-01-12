package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public  interface IStudentDao {
	List<Student> GetAllStudentDao();

	boolean AddNewStudentDao(Student std);

	Student GetStudentByIdDao(int id);

	boolean UpdateStudentDao(Student std);

	boolean DeleteStudentDao(int id);

	boolean CloseStudentDao();

	List<Student> SortStudentByIdDao();

	List<Student> SortStudentByNameDao();

	List<Student> SortStudentByMarksDao();
}
