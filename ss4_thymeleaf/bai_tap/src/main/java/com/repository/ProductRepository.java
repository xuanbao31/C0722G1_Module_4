package com.repository;

import com.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    public static Map<Integer, Product> productMap = new LinkedHashMap<>();

    static {
        productMap.put(1, (new Product(1, "Iphone 14 Pro Max", "18-11-2022", "20000", "Còn Hàng")));
        productMap.put(2, (new Product(2, "Iphone 12 Pro Max", "21-11-2022", "15000", "Hết Hàng")));
        productMap.put(3, (new Product(3, "Iphone 13 Pro Max", "07-08-2022", "17000", "Còn Hàng")));
        productMap.put(4, (new Product(4, "Iphone 11 Pro Max", "31-08-2022", "10000", "Còn Hàng")));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);

    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new  ArrayList<>();
        for (Product product : productMap.values())
            if (product.getName().contains(name)) {
                list.add(product);
            }
        return list;
    }


}
