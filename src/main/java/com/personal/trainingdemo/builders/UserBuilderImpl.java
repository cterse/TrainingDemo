package com.personal.trainingdemo.builders;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.personal.trainingdemo.beans.UserDTO;

public class UserBuilderImpl implements UserBuilder {
	
	@Autowired
	UserDTO user;
	
	@Override
	public UserDTO build() {
		return user;
	}

	@Override
	public UserBuilder setAddress(String value) {
		user.setAddress(value);
		return this;
	}

	@Override
	public UserBuilder setEmail(String value) {
		user.setEmail(value);
		return this;
	}

	@Override
	public UserBuilder setFirstName(String value) {
		user.setFirstName(value);
		return this;
	}

	@Override
	public UserBuilder setId(String value) {
		user.setId(value);
		return this;
	}

	@Override
	public UserBuilder setLastName(String value) {
		user.setLastName(value);
		return this;
	}

	@Override
	public UserBuilder setPassword(String value) {
		user.setPassword(value);
		return this;
	}

	@Override
	public UserBuilder setPhone(String value) {
		user.setPhone(value);
		return this;
	}

	@Override
	public UserBuilder setRegistrationDate(Date value) {
		user.setRegistrationDate(value);
		return this;
	}

}
