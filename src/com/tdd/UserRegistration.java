package com.tdd;

import java.util.HashMap;

public class UserRegistration {
	HashMap <String, String> userMap = new HashMap <String, String>();

	public String addAccount(String userName, String password) {
		if(isUserNameValid(userName)&& isPasswordValid(password) && !isUserRegistered(userName)) {
			userMap.put(userName, password);			
			return  "Account Created Successfully";
			
		}	
	
		return "Account creation failed";
	}
	

	private boolean isPasswordValid(String password) {
		
		return password !=null && password.matches("^(?=(.*\\d){2})(?=.*[a-zA-Z]{2})[0-9a-zA-Z]{8,}");
	}
	
	private boolean isUserNameValid(String userName) {
		if(!(userName == null )&& userName.matches("^[a-zA-Z]{2,11}$")) {
			return true;			
		}
		
		return false;		
		
	}


	private boolean isUserRegistered(String userName) {		
		
		if( userMap.containsKey(userName)) {
			return true;
		}
		
		return false;
			
	}
	
	

}
