package com.Bankapplication.demo.banking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bankapplication.demo.banking.Entity.User;
import com.Bankapplication.demo.banking.Servise.UserServise;

@RestController
@RequestMapping(path="api/v1/users")
public class UserController {
@Autowired
private UserServise userServise;
	
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
		return userServise.save(user);
    	
		
    }
    	@GetMapping("/{username}")
    public User getUser(@PathVariable String Username) {
		return userServise.FindByUsername(Username);
    	
    }

}
