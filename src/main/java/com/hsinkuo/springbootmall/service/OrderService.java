package com.hsinkuo.springbootmall.service;

import com.hsinkuo.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
