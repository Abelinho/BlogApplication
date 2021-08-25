package com.abel.blog.blogweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abel.blog.blogweb.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
