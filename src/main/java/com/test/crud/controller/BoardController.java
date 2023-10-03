package com.test.crud.controller;

import com.test.crud.model.Board;
import com.test.crud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
