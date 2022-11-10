package com.test.crud.board.repository;

import com.test.crud.board.model.Board;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface BoardRepository {
    void save(Board board);

    void update(@Param("boardId") Long id, @Param("boardWriter") String boardWriter);

    Optional<Board> findById(Long boardId);
}
