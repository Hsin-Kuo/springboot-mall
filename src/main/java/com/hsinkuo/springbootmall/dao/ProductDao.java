package com.hsinkuo.springbootmall.dao;

import com.hsinkuo.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
