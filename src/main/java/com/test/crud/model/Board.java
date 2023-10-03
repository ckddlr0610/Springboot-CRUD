package com.test.crud.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Board {

    // Identity를 통해 DB가 기본키를 관리하게 만드려면 DB 테이블에서 AutoIncrement나 DefaultValue를 추가해야함.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long boardId;

    @Column(name = "board_writer")
    private String boardWriter;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private String createdAt;

    public Board() {
    }

    public Board(String boardWriter, String content, String createdAt) {
        this.boardWriter = boardWriter;
        this.content = content;
        this.createdAt = createdAt;
    }
}
