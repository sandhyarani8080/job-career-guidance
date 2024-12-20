package com.symbiosis.job.career.guidance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminLogin {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int AbminLoginId;
private String name,emailid,message;
public AdminLogin() {
	super();
	// TODO Auto-generated constructor stub
}
public AdminLogin(String name, String emailid, String message) {
	super();
	this.name = name;
	this.emailid = emailid;
	this.message = message;
}
public int getAbminLoginId() {
	return AbminLoginId;
}
public void setAbminLoginId(int abminLoginId) {
	AbminLoginId = abminLoginId;
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
	return "AdminLogin [AbminLoginId=" + AbminLoginId + ", name=" + name + ", emailid=" + emailid + ", message="
			+ message + "]";
}


}
