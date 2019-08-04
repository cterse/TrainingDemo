package com.personal.trainingdemo.builders;

import java.sql.Date;

import com.personal.trainingdemo.beans.UserDTO;

public interface UserBuilder {
	UserDTO build();

	UserBuilder setAddress(String value);

	UserBuilder setEmail(String value);

	UserBuilder setFirstName(String value);

	UserBuilder setId(String value);

	UserBuilder setLastName(String value);

	UserBuilder setPassword(String value);

	UserBuilder setPhone(String value);

	UserBuilder setRegistrationDate(Date value);
}