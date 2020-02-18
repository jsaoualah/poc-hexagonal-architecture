package com.ayming.ijss.portailijss_backend.application.adapter;

import com.ayming.ijss.portailijss_backend.application.api.UserService;
import com.ayming.ijss.portailijss_backend.domaine.model.User;
import com.ayming.ijss.portailijss_backend.domaine.spi.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceAdapter implements UserService {

    private UserPersistencePort userPersistencePort;

    @Autowired
    public UserServiceAdapter(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void addUser(User user) {
        userPersistencePort.addUser(user);
    }

    @Override
    public void removeUser(User user) {
        userPersistencePort.removeUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userPersistencePort.getUsers();
    }

    @Override
    public User getUserById(Long userId) {
        return userPersistencePort.getUserById(userId);
    }
}
