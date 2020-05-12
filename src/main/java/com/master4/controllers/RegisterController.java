package com.master4.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.master4.entities.User;
import com.master4.exceptions.ResourceNotFoundException;
import com.master4.services.UserService;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "")
	public String register(ModelMap model, User user) {
		model.addAttribute("user", user);
		return "security/register";
	}

	@PostMapping(value = "/validate")
	public String save(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap model)
			throws ResourceNotFoundException {
		if (result.hasErrors()) {
			model.addAttribute("user", user);
			return "security/register";
		}
		
		user.setRole("USER");
		userService.register(user);
		return "security/login";
	}
}