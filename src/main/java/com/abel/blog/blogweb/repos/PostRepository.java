package com.abel.blog.blogweb.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abel.blog.blogweb.entities.Post;
import com.abel.blog.blogweb.entities.User;

public interface PostRepository extends JpaRepository<Post, Long> {

	Page<Post> findByUserOrderByCreateDateDesc(User user, Pageable pageable);

	Page<Post> findAllByOrderByCreateDateDesc(Pageable pageable);

}
