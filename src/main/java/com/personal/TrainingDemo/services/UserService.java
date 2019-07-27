package com.personal.TrainingDemo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.personal.TrainingDemo.beans.User;

@Service
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	List<User> usersList = new ArrayList<>(Arrays.asList(new User("001-Chinmay"), new User("002-Pranit")));

	public List<User> getAllUsers() {
		logger.trace("inside getAllUsers()");

		return usersList;
	}

	/**
	 * Get user by user id
	 * 
	 * @param id
	 * @return User
	 */
	public User getUser(String id) {
		logger.trace("inside getUser(String id)");

		try {
			if (id == null) {
				throw new NullPointerException("input ID null");
			}

			if (usersList == null) {
				throw new NullPointerException("usersList null");
			}

			Optional<User> optionalUser = usersList.stream().filter(user -> user.getId().equals(id)).findFirst();
			if (optionalUser.isPresent())
				return optionalUser.get();

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
	public int addUser(User user) {
		logger.trace("inside addUser(User user)");

		try {
			if (user == null) {
				throw new NullPointerException("input user null");
			}

			if (usersList == null) {
				throw new NullPointerException("usersList null");
			}

			if (getUser(user.getId()) == null) {
				usersList.add(user);
				return 0;
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return 1;
	}
}
