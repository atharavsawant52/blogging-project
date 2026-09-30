package com.blog.bloggingproject.repository;

import com.blog.bloggingproject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post,Integer> {
}
