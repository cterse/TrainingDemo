package com.personal.trainingdemo.services;

import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.entities.User;
import com.personal.trainingdemo.repositories.UserRepository;
import com.personal.trainingdemo.utils.DTOEntityMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final DTOEntityMapping mapper;

    @Autowired
    public UserService(DTOEntityMapping mapper, UserRepository userRepository) {
        this.mapper = mapper;
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUsers() {
        logger.trace("inside getAllUsers()");

        List<UserDTO> userDTOS = new ArrayList<>();
        userRepository.findAll().forEach(user -> userDTOS.add(mapper.getUserDTOFromEntity(user)));  //TODO: what if null user encountered?
        return userDTOS;
    }

    /**
     * Get user by user id
     *
     * @param id ID of the required User
     * @return User
     */
    public UserDTO getUser(BigInteger id) {
        logger.trace("inside getUser(String id)");

        try {
            if (id == null) {
                throw new NullPointerException("input ID null");
            }

            Optional<User> optionalUser = userRepository.findById(id);
            if (optionalUser.isPresent())
                return mapper.getUserDTOFromEntity(optionalUser.get());

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     * Add user to the database.
     *
     * @param user User to be added to database.
     * @return int
     */
    public int addUser(UserDTO user) {
        logger.trace("inside addUser(User user)");

        try {
            if (user == null) {
                throw new NullPointerException("input user null");
            }

            userRepository.save(mapper.getUserEntityFromDTO(user));
            return 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return 1;
    }
}
