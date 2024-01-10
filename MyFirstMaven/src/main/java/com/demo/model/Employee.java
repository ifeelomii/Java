package com.demo.model;

public class Employee 
{
	private int id;
	private String ename;
	private String email;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Employee(int id, String ename, String email, String phone) {
		super();
		this.id = id;
		this.ename = ename;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", email=" + email + ", phone=" + phone + "]";
	}
	public Employee() {
		super();
	} 
	
	
	
	
}
