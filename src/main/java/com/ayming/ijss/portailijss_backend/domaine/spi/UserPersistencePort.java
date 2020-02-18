package com.ayming.ijss.portailijss_backend.domaine.spi;


import com.ayming.ijss.portailijss_backend.domaine.model.User;

import java.util.List;

public interface UserPersistencePort {

    void addUser(User user);

    void removeUser(User user);

    List<User> getUsers();

    User getUserById(Long userId);
}
