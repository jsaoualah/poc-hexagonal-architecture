package com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.adapter;

import com.ayming.ijss.portailijss_backend.domaine.model.User;
import com.ayming.ijss.portailijss_backend.domaine.spi.UserPersistencePort;
import com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.entity.UserEntity;
import com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.repository.UserRepository;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter implements UserPersistencePort {

    private UserRepository userRepository;

    public UserAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.save(userEntity);
    }

    @Override
    public void removeUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.delete(userEntity);
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<User>();
       /* List<UserEntity> userEntityList = userRepository.findAll();
        for(UserEntity userEntity : userEntityList) {
            User user = new User();
            BeanUtils.copyProperties(userEntity, user);
            userEntity.add(user);
        }*/
        return userList;
    }

    @Override
    public User getUserById(Long userId) {
        UserEntity userEntity = userRepository.findByUserId(userId);
        if (userEntity == null) {
            // throw new UserNotFoundException
        }
        User user = new User();
        BeanUtils.copyProperties(userEntity, user);

        return user;
    }
}
