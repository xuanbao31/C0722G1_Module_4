package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> showAndFindList(Pageable pageable, String name);

    Blog findById(int id);

    void save(Blog blog);

    List<Blog> findAll();

    void remove(int id);

}
