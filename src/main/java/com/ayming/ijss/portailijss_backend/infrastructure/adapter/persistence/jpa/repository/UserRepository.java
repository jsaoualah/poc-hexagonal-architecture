package com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.repository;

import com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUserId(Long userid);
}
