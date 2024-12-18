package com.symbiosis.job.career.guidance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contactus {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int contid;
private String name,emailid,message;
public Contactus() {
	super();
	// TODO Auto-generated constructor stub
}
public Contactus(int regid, String name, String emailid, String message) {
	super();
	this.contid = regid;
	this.name = name;
	this.emailid = emailid;
	this.message = message;
}
public int getRegid() {
	return contid;
}
public void setRegid(int regid) {
	this.contid = regid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "Contactus [regid=" + contid + ", name=" + name + ", emailid=" + emailid + ", message=" + message + "]";
}
public Object getpassword() {
	// TODO Auto-generated method stub
	return null;
}
public void setPassword(Object getpassword) {
	// TODO Auto-generated method stub
	
}
public Object getpassword1() {
	// TODO Auto-generated method stub
	return null;
}

}
