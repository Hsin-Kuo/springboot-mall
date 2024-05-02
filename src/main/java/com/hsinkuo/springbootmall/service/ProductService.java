package com.hsinkuo.springbootmall.service;

import com.hsinkuo.springbootmall.constant.ProductCategory;
import com.hsinkuo.springbootmall.dto.ProductQueryParams;
import com.hsinkuo.springbootmall.dto.ProductRequest;
import com.hsinkuo.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Integer productId);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
