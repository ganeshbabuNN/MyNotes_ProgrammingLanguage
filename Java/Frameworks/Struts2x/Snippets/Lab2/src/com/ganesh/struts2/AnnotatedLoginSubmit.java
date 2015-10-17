package com.ganesh.struts2;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

import com.opensymphony.xwork2.ActionSupport;

@Results({
	@Result(name="input" ,value="/login.jsp"),
	@Result(name="success",value="/home.jsp"),
	@Result(name="failed",value="/login.jsp")
})
public class AnnotatedLoginSubmit extends ActionSupport {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public void validate() {
		if(username == null || username.length()==0){
			addFieldError("username", "Username is Required");
		}
		if(password == null || password.length()==0){
			addFieldError("password", "password is Required");
		}
	}
	@Override
	public String execute() throws Exception {
			System.out.println("execute()");
			String result = "";
			if(username.equals(password)){
				result = "success";
			}else{
				result ="failed";
				addActionError("Invalid Username or Password");
			}
		return result;
	}

}
