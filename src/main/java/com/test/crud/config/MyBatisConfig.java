package com.test.crud.config;

import com.test.crud.board.mapper.BoardMapper;
import com.test.crud.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {
//    private final BoardMapper boardMapper;

//    @Bean
//    public BoardRepository boardRepository() {
//        return new BoardRepositoryImpl(boardMapper);
//    }
}
