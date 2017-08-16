package com.boys.server.impl;

import org.springframework.stereotype.Service;

import com.boys.bean.User;
import com.boys.server.iface.IUserService;

@Service
public class UserServiceImpl implements IUserService{
   
	public User getUserById(String userId) {
		User user = new User();
		user.setAge(22);
		user.setId(1);
		user.setName("SETNAME....");
		return user;
	}

	@Override
	public void creteUser(User user) {
		System.out.println("save user");
	}
	
}
