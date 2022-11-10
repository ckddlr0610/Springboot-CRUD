package com.test.crud.board.controller;

import com.test.crud.board.model.Board;
import com.test.crud.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping()
    public void save(Board board) {
        boardService.save(board);
    }

    public void update(Long boardId, String boardWriter) {
        boardService.update(boardId, boardWriter);
    }

    @GetMapping()
    public void findById(Long boardId) {

    }

//    @GetMapping()
//    public List<Board> findAll() {
//
//    }
}
