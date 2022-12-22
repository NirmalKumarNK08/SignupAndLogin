package com.webapp.signupproject.service;

import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.signupproject.repository.UserRepository;
import com.webapp.signupproject.web.dto.UserRegistrationDto;
import com.webapp.signupproject.model.Role;
import com.webapp.signupproject.model.User;

@Service
public class UserServiceImpl implements UserService {
//	@Autowired
	private UserRepository userRepository;
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), 
				registrationDto.getLastName(), 
				registrationDto.getEmail(), 
				registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}	
}
