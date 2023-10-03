package com.test.crud;

import com.test.crud.model.Board;
import com.test.crud.repository.BoardRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    void save() {
        //when
        Board board = new Board("changik","123","2022-11-11");

        //given
        boardRepository.save(board);

        //then
        Board findBoard = boardRepository.findById(board.getBoardId()).get();
        Assertions.assertThat(findBoard).isEqualTo(board);
    }

    @Test
    void update() {

    }
}
