package com.test.crud.config;

import com.test.crud.repository.BoardRepository;
import com.test.crud.repository.jpa.JpaBoardRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class JpaConfig {
    private final EntityManager entityManager;

    public JpaConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Bean
    public BoardRepository boardRepository() {
        return new JpaBoardRepository(entityManager);
    }
}
