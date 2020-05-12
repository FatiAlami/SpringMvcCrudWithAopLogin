package com.master4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master4.entities.User;
import com.master4.exceptions.ResourceNotFoundException;
import com.master4.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void register(User user) {
		userRepository.save(user);
	}

	@Override
	public User login(String email, String password) throws ResourceNotFoundException {
		return userRepository.login(email, password);
	}
}
