package com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.config;

import com.ayming.ijss.portailijss_backend.domaine.spi.UserPersistencePort;
import com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.adapter.UserAdapter;
import com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdapterConfiguration {

    @Bean
    public UserPersistencePort
    getUserPersistencePort(UserRepository userRepository) {
        return new UserAdapter(userRepository);
    }
}
