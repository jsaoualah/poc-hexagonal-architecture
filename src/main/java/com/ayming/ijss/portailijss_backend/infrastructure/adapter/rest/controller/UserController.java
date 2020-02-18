package com.ayming.ijss.portailijss_backend.infrastructure.adapter.rest.controller;

import com.ayming.ijss.portailijss_backend.domaine.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserController {

    @GetMapping("/user")
    ResponseEntity<List<User>> getUsers();

    @PostMapping("/user")
    ResponseEntity<Void> addUser(@RequestBody User user);

    @DeleteMapping("/user")
    ResponseEntity<Void> removeUser(@RequestBody User user);

    @GetMapping("/user/{userId}")
    ResponseEntity<User> getUserById(@PathVariable Long userId);
}
