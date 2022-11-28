package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICategoryService {
    List<Category> findAll();

    Category findById(int id);

    Page<Category> showListAndFindList(Pageable pageable, String name);

    void save(Category category);

    void remove(int id);
}
