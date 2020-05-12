package com.master4.controllers;


import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.master4.entities.User;
import com.master4.exceptions.ResourceNotFoundException;
import com.master4.services.UserService;
@Controller
@RequestMapping(value = {"", "/login"})
public class LoginController {

	 @Autowired
	private UserService userService;
	
	@GetMapping(value = "")
	public String login() {
		return "security/login";
	}

	@PostMapping(value = "/check")
	public String validateLogin(String email, String password, HttpSession session, Model model) throws ResourceNotFoundException {

		/**
		 * Create user session
		 */
		User user = userService.login(email, password);

		// Check if the login process validated or not.
		if (user == null) {
			model.addAttribute("message", "Login failed. Try again.");
			return "security/login";
		} else {
			session.setAttribute("user", user);
			return "article/home";
		}
	}
}