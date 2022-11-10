package com.test.crud.board.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(name = "board_writer")
    private String boardWriter;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private String createdAt;
}
