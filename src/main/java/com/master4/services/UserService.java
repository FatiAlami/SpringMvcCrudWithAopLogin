package com.master4.services;

import com.master4.entities.User;
import com.master4.exceptions.ResourceNotFoundException;

public interface UserService {

	public void register(User user);

	public User login(String email, String password) throws ResourceNotFoundException;

}
