package com.test.crud.repository.jpa;

import com.test.crud.model.Board;
import com.test.crud.repository.BoardRepositoryCopy;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public class JpaBoardRepositoryCopy implements BoardRepositoryCopy {

    private final EntityManager entityManager;

    public JpaBoardRepositoryCopy(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Board board) {
        entityManager.persist(board);
    }

    @Override
    public void update(Long id, String boardWriter) {
        Board board = entityManager.find(Board.class, id);
        board.setBoardWriter(boardWriter);
    }

    @Override
    public Optional<Board> findById(Long boardId) {
        Board board = entityManager.find(Board.class, boardId);
        return Optional.ofNullable(board);
    }
}
