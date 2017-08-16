package com.boys.server;

import org.springframework.stereotype.Service;

import com.boys.bean.User;

@Service
public interface IUserService {
   
	
	public void createUser(User user);

	public User getUserById(String userId);
	
}
