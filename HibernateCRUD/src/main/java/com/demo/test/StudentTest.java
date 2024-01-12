package com.demo.test;

import java.util.*;

import com.demo.model.Student;
import com.demo.service.StudentService;

public class StudentTest {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			StudentService ss = null;
			int ch;
			do{
				ch=0;
				System.out.println();
				System.out.println("1) Enter 1 to display all Students \n2) Enter 2 to search by Id");
				System.out.println("3) Enter 3 to add new student \n4) Enter 4 to update Student");
				System.out.println("5) Enter 5 to delete student by id \n6) Enter 6 to sort \n7) Enter 7 to exit");
				System.out.println("Enter your choice");
				ch = sc.nextInt();
				
				switch (ch) {
				case 1:{
					ss = new StudentService();
					List<Student> list = ss.GetAllStudentService();
					list.forEach(System.out::println);
					break;
				}
					
				case 2:{
					ss = new StudentService();
					Student std = ss.GetStudentByIdService();
					System.out.println(std);
					break;
				}
				
				case 3:{
					ss = new StudentService();
					boolean flag = ss.AddNewStudentService();
					if(flag)
						System.out.println("Student Added Successfully\n");
					else
						System.out.println("Operation Failed\n");
					break;
				}
				
				case 4:{
					ss = new StudentService();
					boolean flag = ss.UpdateStudentService();
					if(flag)
						System.out.println("Student Updated Successfully\n");
					else
						System.out.println("Operation Failed\n");
					break;
				}
				
				case 5:{
					ss = new StudentService();
					boolean flag = ss.DeleteStudentService();
					if(flag)
						System.out.println("Student Deleted Successfully\n");
					else
						System.out.println("Operation Failed\n");
					break;
				}
				
				case 6:{
					ss = new StudentService();
					List<Student> list = ss.SortStudentService();
					list.forEach(System.out::println);
					break;
				}
				case 7:{
					ss = new StudentService();
					boolean flag = ss.CloseStudentService();
					if(flag) {
						System.out.println("Session Closed\n");
						sc.close();
						System.exit(0);
					}
					else
						System.out.println("Operation Failed\n");
					break;
				}
				
				default:
					System.out.println("Incorrect Input\n");
					break;
				}
				
			}while(ch!=8);
		
		}
}
