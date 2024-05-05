package com.hsinkuo.springbootmall.dao;

import com.hsinkuo.springbootmall.constant.ProductCategory;
import com.hsinkuo.springbootmall.dto.ProductQueryParams;
import com.hsinkuo.springbootmall.dto.ProductRequest;
import com.hsinkuo.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Product getProductById(Integer productId);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
    Integer countProduct(ProductQueryParams productQueryParams);


}
