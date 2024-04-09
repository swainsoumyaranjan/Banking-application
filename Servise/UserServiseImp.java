package com.Bankapplication.demo.banking.Servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.Bankapplication.demo.banking.Entity.User;
import com.Bankapplication.demo.banking.Repository.UserRepository;
@Service

public abstract class UserServiseImp implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
     
	public User save(User user) {
		return userRepository.save(user);
		
	}
	
	public User findByUsername(String username) {
		return userRepository.findbyUsername(username);
		
	}


}
