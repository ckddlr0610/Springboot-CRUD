package com.test.crud.board.mapper;

import com.test.crud.board.model.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface BoardMapper {
    void save(Board board);

    void update(@Param("boardId") Long id, @Param("boardWriter") String boardWriter);

    Optional<Board> findById(Long boardId);
}
