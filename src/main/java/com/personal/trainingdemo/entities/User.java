package com.personal.trainingdemo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.annotation.Generated;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_ID_GENERATOR", sequenceName="HIBERNATE_USER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ID_GENERATOR")
	@Column(unique=true, nullable=false, length=30)
	private String id;

	@Column(length=200)
	private String address;

	@Column(name="CREATED_BY", length=100)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(length=100)
	private String email;

	@Column(name="FIRST_NAME", length=100)
	private String firstName;

	@Column(name="LAST_NAME", length=100)
	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(length=200)
	private String password;

	@Column(length=20)
	private String phone;

	@Temporal(TemporalType.DATE)
	private Date registrationdate;

	@Generated("SparkTools")
	private User(Builder builder) {
		this.id = builder.id;
		this.address = builder.address;
		this.createdBy = builder.createdBy;
		this.createdDate = builder.createdDate;
		this.email = builder.email;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.lastUpdateDate = builder.lastUpdateDate;
		this.password = builder.password;
		this.phone = builder.phone;
		this.registrationdate = builder.registrationdate;
	}

	public User() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
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
		private String id;
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

		public Builder withId(String id) {
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