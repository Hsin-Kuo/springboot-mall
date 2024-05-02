package com.hsinkuo.springbootmall.dao;

import com.hsinkuo.springbootmall.constant.ProductCategory;
import com.hsinkuo.springbootmall.dto.ProductRequest;
import com.hsinkuo.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Product getProductById(Integer productId);
    List<Product> getProducts(ProductCategory category, String search);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
