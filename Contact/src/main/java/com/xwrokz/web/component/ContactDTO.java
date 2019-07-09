package com.xwrokz.web.component;

import java.io.Serializable;

public class ContactDTO implements Serializable {
	
	public ContactDTO() {
		System.out.println("Created\t"+this.getClass().getSimpleName());
	}

	private String name;
	private String email;
	private String description;
	private long phoneNo;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		System.out.println("Overriden method");
		return "ContactDTO [name=" + name + ", email=" + email + ", description=" + description + ", phoneNo=" + phoneNo
				+ ", address=" + address + "]";
	}

}
