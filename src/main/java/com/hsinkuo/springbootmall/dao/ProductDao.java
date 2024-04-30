package com.hsinkuo.springbootmall.dao;

import com.hsinkuo.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Product getProductById(Integer productId);
    List<Product> getProducts();
}
