package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface IStudentService {
	List<Student> GetAllStudentService();
	
	public boolean AddNewStudentService();
	
	Student GetStudentByIdService();
	
	boolean UpdateStudentService();
	
	boolean DeleteStudentService();
	
	boolean CloseStudentService();
	
	List<Student> SortStudentService();
}
