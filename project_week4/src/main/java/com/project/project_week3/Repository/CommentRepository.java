package com.project.project_week3.Repository;

import com.project.project_week3.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPostId(Long id);

    boolean existsByAuthorAndId(String author, Long id);
}
