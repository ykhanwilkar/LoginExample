package com.loginlogout.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginlogout.example.model.User;
import com.loginlogout.example.repository.UserRepository;
import com.loginlogout.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public String validateUser(User user) {
		List<User> userList = userRepository.getUserList();
		String loginMessage = "UserNotFound";
		for(User u: userList) {
			if(u.equals(user)) {
				loginMessage = "Welcome "+user.getUsername();
			}
		}
		return loginMessage;
	}

}
