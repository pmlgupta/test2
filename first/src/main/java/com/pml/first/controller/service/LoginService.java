package com.pml.first.controller.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userid,String password)
	{
		return(userid.equalsIgnoreCase("madhavi")&& password.equalsIgnoreCase("latha"));
	}
	
	
}
