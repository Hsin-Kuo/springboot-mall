package com.hsinkuo.springbootmall.service;

import com.hsinkuo.springbootmall.dto.CreateOrderRequest;
import com.hsinkuo.springbootmall.dto.OrderQueryParams;
import com.hsinkuo.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
