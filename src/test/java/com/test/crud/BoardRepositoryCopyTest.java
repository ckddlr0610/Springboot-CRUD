package com.test.crud;

import com.test.crud.model.Board;
import com.test.crud.repository.BoardRepositoryCopy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
public class BoardRepositoryCopyTest {

    @Autowired
    BoardRepositoryCopy boardRepositoryCopy;

    @Test
    void save() {
        //when
        Board board = new Board("changik","123","2022-11-11");

        //given
        boardRepositoryCopy.save(board);

        //then
        Board findBoard = boardRepositoryCopy.findById(board.getBoardId()).get();
        Assertions.assertThat(findBoard).isEqualTo(board);
    }

    @Test
    void update() {

    }
}
