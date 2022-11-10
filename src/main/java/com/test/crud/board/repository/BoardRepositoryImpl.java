package com.test.crud.board.repository;

import com.test.crud.board.mapper.BoardMapper;
import com.test.crud.board.model.Board;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
//@RequiredArgsConstructor
//public class BoardRepositoryImpl implements BoardRepository {
//    private final BoardMapper boardMapper;
//
//    public void save(Board board) {
//        boardMapper.save(board);
//    }
//
//    public void update(@Param("boardId") Long id, @Param("boardWriter") String boardWriter) {
//        boardMapper.update(id, boardWriter);
//    }
//
//    public Optional<Board> findById(Long boardId) {
//        return boardMapper.findById(boardId);
//    }
//
//}

