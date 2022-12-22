package com.webapp.signupproject.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.webapp.signupproject.model.User;
import com.webapp.signupproject.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
