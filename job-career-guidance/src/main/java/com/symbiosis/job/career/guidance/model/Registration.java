package com.symbiosis.job.career.guidance.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;;


@Entity

public class Registration {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int regid;
private String name,address,city,gender,contant,emailid,password;
public Registration() {
	super();
	// TODO Auto-generated constructor stub
}
public Registration(String name, String address, String city, String gender, String contant, String emailid,
		String password) {
	super();
	this.name = name;
	this.address = address;
	this.city = city;
	this.gender = gender;
	this.contant = contant;
	this.emailid = emailid;
	this.password = password;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getContant() {
	return contant;
}
public void setContant(String contant) {
	this.contant = contant;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Registration [regid=" + regid + ", name=" + name + ", address=" + address + ", city=" + city + ", gender="
			+ gender + ", contant=" + contant + ", emailid=" + emailid + ", password=" + password + "]";
}

	
}
