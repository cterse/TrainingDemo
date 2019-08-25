package com.personal.trainingdemo.services;

import com.personal.trainingdemo.beans.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	public List<UserDTO> getAllUsers() {
		logger.trace("inside getAllUsers()");

		return null;
	}

	/**
	 * Get user by user id
	 * 
	 * @param id
	 * @return User
	 */
	public UserDTO getUser(String id) {
		logger.trace("inside getUser(String id)");

		try {
			if (id == null) {
				throw new NullPointerException("input ID null");
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}
	
	/**
	 * Add user if not already present
	 * @param user
	 * @return int
	 */
	public int addUser(UserDTO user) {
		logger.trace("inside addUser(User user)");

		try {
			if (user == null) {
				throw new NullPointerException("input user null");
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return 1;
	}
}
