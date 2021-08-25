package com.abel.blog.blogweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abel.blog.blogweb.entities.Comment;
import com.abel.blog.blogweb.repos.CommentRepository;
import com.abel.blog.blogweb.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }

}
