package com.symbiosis.job.career.guidance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
@Id
private int logid;
private String emailid,password;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(int logid, String emailid, String password) {
	super();
	this.logid = logid;
	this.emailid = emailid;
	this.password = password;
}
public int getLogid() {
	return logid;
}
public void setLogid(int logid) {
	this.logid = logid;
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
	return "Login [logid=" + logid + ", emailid=" + emailid + ", password=" + password + "]";
}
	

}
