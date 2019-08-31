package com.personal.trainingdemo.controllers;

import com.personal.trainingdemo.beans.UserDTO;
import com.personal.trainingdemo.services.UserService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.math.BigInteger;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class UserControllerTest {

    @Rule public MockitoRule rule = MockitoJUnit.rule();

    @Mock private UserService userService;

    @InjectMocks private UserController userController;

    @Test
    public void findAllUsers() {

        userController.findAllUsers();

        verify(userService, times(1)).getAllUsers();
    }

    @Test
    public void findUserById() {

        userController.findUserById(BigInteger.ONE);

        verify(userService, times(1)).getUser(BigInteger.ONE);
    }

    @Test
    public void addUser() {
        UserDTO userDTO = new UserDTO();

        userController.addUser(userDTO);

        verify(userService, times(1)).addUser(userDTO);
    }
}