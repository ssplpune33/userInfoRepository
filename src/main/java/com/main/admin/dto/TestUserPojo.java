package com.main.admin.dto;

import java.time.LocalDate;
import java.util.Date;

public class TestUserPojo {

	private Integer id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String mobileNumber;
	private String city;
	private String actionFlag;
	
	
	
	
	public String getActionFlag() {
		return actionFlag;
	}
	public void setActionFlag(String actionFlag) {
		this.actionFlag = actionFlag;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "TestUserPojo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", mobileNumber=" + mobileNumber + ", city=" + city + ", actionFlag=" + actionFlag + "]";
	}
	public TestUserPojo(Integer id, String firstName, String lastName, LocalDate dob, String mobileNumber, String city
		) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobileNumber = mobileNumber;
		this.city = city;
		
	}
	public TestUserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
