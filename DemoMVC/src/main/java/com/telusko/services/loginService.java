package com.telusko.services;

public class loginService {

	public boolean checkLogin(String userName, String pass){
		
		System.out.println(" USername: "+ userName + " and pass: "+ pass);
		if(userName.equals("santosh") && pass.equals("santosh"))
			return true;
			return false;
		
		
	}
}
