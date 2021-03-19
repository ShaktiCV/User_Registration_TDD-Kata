package com.tdd.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tdd.UserRegistration;


public class UserRegistrationTest {
	String accountCreationStatus;
	UserRegistration userRegistration = new UserRegistration();
	
	@Test
	public void shouldCreateUserAccountWhenValidCredentialsAreGiven() {		
		accountCreationStatus = userRegistration.addAccount("shakti", "1abc23456");
		assertEquals("Account Created Successfully", accountCreationStatus);			
	}


	@Test
	public void shouldGiveFailureMessageIfUserNameIsNull() {
	accountCreationStatus = userRegistration.addAccount(null,"1ab2345");
	assertEquals("Account creation failed", accountCreationStatus);
	}
	
	@Test
	public void shouldGiveFailureMessageIfPasswordIsNull() {	
	accountCreationStatus = userRegistration.addAccount("shakti",null);
	assertEquals("Account creation failed", accountCreationStatus);
	}
	
	@Test
	public void shouldGivefailureMessageIfUserNameHasNumbers() {		
		accountCreationStatus = userRegistration.addAccount("shakti12","1abc2345");
		assertEquals("Account creation failed", accountCreationStatus);		
	}
	
	@Test
	public void shouldGivefailureMessageIfUserNameLengthIsMoreThan11() {		
		accountCreationStatus = userRegistration.addAccount("mamatadfsdfdsfsdfdfdsfjds","1abc2345");
		assertEquals("Account creation failed", accountCreationStatus);		
	}
	
	@Test
	public void shouldGivefailureMessageIfPasswordContainsSpecialChars() {		
		accountCreationStatus = userRegistration.addAccount("mamata","password123!!");
		assertEquals("Account creation failed", accountCreationStatus);		
	}
	

	
	@Test
	public void shouldGiveErrorMessageWhenUserAccWithSameUserNameIsRegistered() {	
		userRegistration.addAccount("shakti", "1abc23456");		
		accountCreationStatus = userRegistration.addAccount("shakti", "1abc23456");
		assertEquals("Account creation failed", accountCreationStatus);
		
	}
		
		
	

}
	
