package com.kyr.jsf.validatedemo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentTwo {

	private String firstName;
	private String lastName;
	private String postalCode;
	private int freePasses;
	private String phoneNumber;
	private String courseCode;

	public StudentTwo() {

	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	// Course Code Validation method
	public void courseCodeValidator(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		if(value==null) {return;}
		
		String data = value.toString();
		
		if(!data.startsWith("Java"))
		{
			FacesMessage message = new FacesMessage("The Code for this course must start with \"Java\"");  
			throw new ValidatorException(message);
		}
	}
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
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

}
