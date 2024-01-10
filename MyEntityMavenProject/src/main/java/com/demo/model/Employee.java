package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "emp_tbl")
public class Employee {
	@Id
	@Column(name = "empid", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Column(name="name")
	private String name;
	@Column(name="phone")
	private String phone;
	@Column(name="sal")
	private double sal;

	public Employee() {
		super();
	}

	public Employee(int empid, String name, String phone, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.phone = phone;
		this.sal = sal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", phone=" + phone + ", sal=" + sal + "]";
	}
}
