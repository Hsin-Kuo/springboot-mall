package com.hsinkuo.springbootmall.service;

import com.hsinkuo.springbootmall.dto.CreateOrderRequest;
import com.hsinkuo.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
