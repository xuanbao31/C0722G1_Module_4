package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();

    Optional<Blog> findById(int id);

    void save(Blog blog);

    void remove(int id);
}
