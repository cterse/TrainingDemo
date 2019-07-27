package com.personal.TrainingDemo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.TrainingDemo.beans.User;
import com.personal.TrainingDemo.services.UserService;

@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> findAllUsers() {
		logger.trace("inside findAllUsers() ");
		
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable String id) {
		logger.trace("inside findUserById(@PathVariable String id)");
		
		return userService.getUser(id);
	}
	
	@PostMapping("/users")
	public int addUser(@RequestBody User user) {
		logger.trace("inside addUser(@RequestBody User user)");
		
		return userService.addUser(user);
	}
}
