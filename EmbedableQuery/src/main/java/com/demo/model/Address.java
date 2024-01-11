package com.demo.model;

import javax.persistence.*;

@Embeddable
public class Address {
	private int addid;
	private String street;
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

	public int getId() {
		return addid;
	}

	public void setId(int addid) {
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
		return "Address [id=" + addid + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
}
