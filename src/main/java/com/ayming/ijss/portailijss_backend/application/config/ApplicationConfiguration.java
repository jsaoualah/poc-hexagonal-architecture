package com.ayming.ijss.portailijss_backend.application.config;

import com.ayming.ijss.portailijss_backend.application.adapter.UserServiceAdapter;
import com.ayming.ijss.portailijss_backend.application.api.UserService;
import com.ayming.ijss.portailijss_backend.domaine.spi.UserPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public UserService getUserService(UserPersistencePort userPersistencePort) {
        return new UserServiceAdapter(userPersistencePort);
    }
}
