package com.symbiosis.job.career.guidance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enquiry {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Enquiryid;
private String name,age,email,contact,eductionalbackground,currentstatus,workexperience;
public Enquiry() {
	super();
	// TODO Auto-generated constructor stub
}
public Enquiry(String name, String age, String email, String contact, String eductionalbackground, String currentstatus,
		String workexperience) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
	this.contact = contact;
	this.eductionalbackground = eductionalbackground;
	this.currentstatus = currentstatus;
	this.workexperience = workexperience;
}
public int getEnquiryid() {
	return Enquiryid;
}
public void setEnquiryid(int enquiryid) {
	Enquiryid = enquiryid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getEductionalbackground() {
	return eductionalbackground;
}
public void setEductionalbackground(String eductionalbackground) {
	this.eductionalbackground = eductionalbackground;
}
public String getCurrentstatus() {
	return currentstatus;
}
public void setCurrentstatus(String currentstatus) {
	this.currentstatus = currentstatus;
}
public String getWorkexperience() {
	return workexperience;
}
public void setWorkexperience(String workexperience) {
	this.workexperience = workexperience;
}
@Override
public String toString() {
	return "Enquiry [Enquiryid=" + Enquiryid + ", name=" + name + ", age=" + age + ", email=" + email + ", contact="
			+ contact + ", eductionalbackground=" + eductionalbackground + ", currentstatus=" + currentstatus
			+ ", workexperience=" + workexperience + "]";
}






}