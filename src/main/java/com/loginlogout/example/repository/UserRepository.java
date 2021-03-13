package com.loginlogout.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.loginlogout.example.model.User;

@Repository
public class UserRepository {

	List<User> userList;
	
	public List<User> getUserList() {
		addData();
		return userList;
	}
	
	private void addData() {
		userList = new ArrayList<User>();
		User user = new User();
		user.setPassword("123");
		user.setUsername("root");
		userList.add(user);
		user = new User();
		user.setPassword("456");
		user.setUsername("toor");
		userList.add(user);
		user = new User();
		user.setPassword("abc");
		user.setUsername("XYZ");
		userList.add(user);
		user = new User();
		user.setPassword("1234");
		user.setUsername("abcd");
		userList.add(user);
		user = new User();
		user.setPassword("abcd");
		user.setUsername("pqrs");
		userList.add(user);
	}
}
