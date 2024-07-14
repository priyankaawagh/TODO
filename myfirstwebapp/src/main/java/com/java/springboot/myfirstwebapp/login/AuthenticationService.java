package com.java.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String userName, String password)
	{
		boolean isValidUserName = userName.equalsIgnoreCase("Priyanka");
		boolean isValidPassword = password.equalsIgnoreCase("Priyak14@");
		return isValidUserName && isValidPassword;
	}

}
