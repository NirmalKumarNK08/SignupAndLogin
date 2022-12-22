package com.webapp.signupproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.signupproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
