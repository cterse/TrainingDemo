package com.personal.trainingdemo.beans;

import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1325594779428364157L;
	private BigInteger id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String password;
	private Date registrationDate;

	@Generated("SparkTools")
	private UserDTO(Builder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.phone = builder.phone;
		this.address = builder.address;
		this.password = builder.password;
		this.registrationDate = builder.registrationDate;
	}
	
	public UserDTO(BigInteger id) {
		super();
		this.id = id;
	}
	public UserDTO() {
		super();
	}

	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Creates builder to build {@link UserDTO}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link UserDTO}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private BigInteger id;
		private String firstName;
		private String lastName;
		private String email;
		private String phone;
		private String address;
		private String password;
		private Date registrationDate;

		private Builder() {
		}

		public Builder withId(BigInteger id) {
			this.id = id;
			return this;
		}

		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder withPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder withRegistrationDate(Date registrationDate) {
			this.registrationDate = registrationDate;
			return this;
		}

		public UserDTO build() {
			return new UserDTO(this);
		}
	}
	
	
}
