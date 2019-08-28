package com.personal.trainingdemo.repositories;

import com.personal.trainingdemo.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UserRepository extends CrudRepository<User, BigInteger> {
}
