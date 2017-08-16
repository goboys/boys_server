package com.boys.server.impl;

import org.springframework.stereotype.Service;

import com.boys.bean.User;
import com.boys.server.IUserService;

@Service
public class UserServiceImpl implements IUserService{
   
	
	public void createUser(User user){
		System.out.println("save user");
	}

	public User getUserById(String userId) {
		User user = new User();
		user.setAge(22);
		user.setId(1);
		user.setName("°¢±ó,ºÜ²»´í....");
		return user;
	}
	
}
