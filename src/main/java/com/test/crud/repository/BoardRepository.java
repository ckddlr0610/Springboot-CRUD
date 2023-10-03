package com.test.crud.repository;

import com.test.crud.model.Board;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface BoardRepository {
    void save(Board board);

    void update(@Param("boardId") Long id, @Param("boardWriter") String boardWriter);

    Optional<Board> findById(Long boardId);
}
