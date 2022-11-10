package com.test.crud.board.service;

import com.test.crud.board.model.Board;
import com.test.crud.board.repository.BoardRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public void save(Board board) {
        boardRepository.save(board);
    }

    public void update(@Param("boardId") Long id, @Param("boardWriter") String boardWriter) {
        boardRepository.update(id, boardWriter);
    }

    public Optional<Board> findById(Long boardId) {
        return boardRepository.findById(boardId);
    }
}
