package com.ayming.ijss.portailijss_backend.infrastructure.adapter.rest.controller;

import com.ayming.ijss.portailijss_backend.application.api.UserService;
import com.ayming.ijss.portailijss_backend.domaine.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    private UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addUser(User user) {
        userService.addUser(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> removeUser(User user) {
        userService.removeUser(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> getUserById(Long userId) {
        return new ResponseEntity<User>(userService.getUserById(userId), HttpStatus.OK);
    }
}
