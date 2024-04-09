package com.Bankapplication.demo.banking.Repository;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.Bankapplication.demo.banking.Entity.User;

import jakarta.persistence.EntityManager;

public class UserRepository extends SimpleJpaRepository<User,Long>{

	public UserRepository(Class<User> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		
	}

	public User findbyUsername(String username) {
		return null;
	}

}
