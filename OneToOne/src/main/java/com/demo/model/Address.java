package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name="add_tbl")
public class Address {
	@Id
	@Column(name="addid")
	private int addid;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	public Address() {
		super();
	}
	public Address(int addid, String street, String city) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
