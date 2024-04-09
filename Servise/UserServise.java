package com.Bankapplication.demo.banking.Servise;

import org.springframework.stereotype.Service;

import com.Bankapplication.demo.banking.Entity.User;

@Service
public abstract  class UserServise {

	 public abstract User save(User user);
	 public abstract User FindByUsername(String Username);
	
	
	
	
}
