package com.hsinkuo.springbootmall.dao;

import com.hsinkuo.springbootmall.dto.OrderQueryParams;
import com.hsinkuo.springbootmall.model.Order;
import com.hsinkuo.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
};
