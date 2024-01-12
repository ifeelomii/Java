package com.demo.service;

import java.util.*;

import com.demo.dao.*;
import com.demo.model.*;

public class StudentService implements IStudentService{
	
	private IStudentDao sdao;
	Scanner sc = new Scanner(System.in);
	
	public StudentService() {
		sdao = new StudentDao();
	}


	public List<Student> GetAllStudentService() {
		return sdao.GetAllStudentDao(); 
	}


	public boolean AddNewStudentService() {
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		System.out.println("Enter Student Name");
		String name = sc.next();
		System.out.println("Enter Student Marks");
		int marks = sc.nextInt();
		Student std = new Student(id,name,marks);
		
		return sdao.AddNewStudentDao(std);
	}


	public Student GetStudentByIdService() {
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		return sdao.GetStudentByIdDao(id);
	}


	public boolean UpdateStudentService() {
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		System.out.println("Enter Student Name");
		String name = sc.next();
		System.out.println("Enter Student Marks");
		int marks = sc.nextInt();
		Student std = new Student(id,name,marks);
		return sdao.UpdateStudentDao(std);
	}


	public boolean DeleteStudentService() {
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		return sdao.DeleteStudentDao(id);
	}


	public boolean CloseStudentService() {
		return sdao.CloseStudentDao();
	}


	public List<Student> SortStudentService() {
		System.out.println("1. Sort By Id");
		System.out.println("2. Sort By Name");
		System.out.println("3. Sort By Marks");
		System.out.println("Enter Your Value");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			return sdao.SortStudentByIdDao();
		case 2:
			return sdao.SortStudentByNameDao();
		case 3:
			return sdao.SortStudentByMarksDao();
		default:
			System.out.println("Invalid Input");
			return null;
		}
		
	}

}
