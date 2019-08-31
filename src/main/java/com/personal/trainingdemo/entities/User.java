package com.personal.trainingdemo.entities;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=200)
	private String address;

	@Column(length=100)
	private String email;

	@Column(name="FIRST_NAME", length=100)
	private String firstName;

	@Column(name="LAST_NAME", length=100)
	private String lastName;

	@Column(length=200)
	private String password;

	@Column(length=20)
	private String phone;

	@Temporal(TemporalType.DATE)
	private Date registrationdate;

	@Generated("SparkTools")
	private User(Builder builder) {
		this.address = builder.address;
		this.email = builder.email;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.password = builder.password;
		this.phone = builder.phone;
		this.registrationdate = builder.registrationdate;

		this.setId(builder.id);
		this.setLastUpdateDate(builder.lastUpdateDate);
		this.setCreateDate(builder.createdDate);
		this.setCreatedBy(builder.createdBy);
	}

	public User() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegistrationdate() {
		return this.registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	/**
	 * Creates builder to build {@link User}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link User}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private BigInteger id;
		private String address;
		private String createdBy;
		private Date createdDate;
		private String email;
		private String firstName;
		private String lastName;
		private Date lastUpdateDate;
		private String password;
		private String phone;
		private Date registrationdate;

		private Builder() {
		}

		public Builder withId(BigInteger id) {
			this.id = id;
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder withCreatedBy(String createdBy) {
			this.createdBy = createdBy;
			return this;
		}

		public Builder withCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
			return this;
		}

		public Builder withEmail(String email) {
			this.email = email;
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

		public Builder withLastUpdateDate(Date lastUpdateDate) {
			this.lastUpdateDate = lastUpdateDate;
			return this;
		}

		public Builder withPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder withRegistrationdate(Date registrationdate) {
			this.registrationdate = registrationdate;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

}