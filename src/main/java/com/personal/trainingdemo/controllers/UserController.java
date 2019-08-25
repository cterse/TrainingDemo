package com.personal.trainingdemo.controllers;

import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<UserDTO> findAllUsers() {
		logger.trace("inside findAllUsers() ");
		
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public UserDTO findUserById(@PathVariable String id) {
		logger.trace("inside findUserById(@PathVariable String id)");
		
		return userService.getUser(id);
	}
	
	@PostMapping("/users")
	public int addUser(@RequestBody UserDTO user) {
		logger.trace("inside addUser(@RequestBody User user)");
		
		return userService.addUser(user);
	}
}
