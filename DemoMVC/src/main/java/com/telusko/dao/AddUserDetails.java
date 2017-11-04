package com.telusko.dao;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class AddUserDetails {

	private String username;
	private String password;
	private String mobileNum;
	private String address;
	private String state;
	
	
	public AddUserDetails() {
		
	}
	public AddUserDetails(String username, String password, String mobileNum, String address, String state) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNum = mobileNum;
		this.address = address;
		this.state = state;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "addUserDetails [username=" + username + ", password=" + password + ", mobileNum=" + mobileNum + ", address="
				+ address + ", state=" + state + "]";
	}
}
