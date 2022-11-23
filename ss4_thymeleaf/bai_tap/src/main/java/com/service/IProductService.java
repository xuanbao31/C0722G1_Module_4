package com.service;

import com.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    void remove(int id);

    Product findById(int id);

    void update(int id,Product product);
    List<Product> findByName(String name);
}