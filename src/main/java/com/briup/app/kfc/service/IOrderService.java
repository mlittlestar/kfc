package com.briup.app.kfc.service;

import com.briup.app.kfc.bean.Extend.OrderExtend;
import com.briup.app.kfc.bean.Order;

import java.util.List;

public interface IOrderService {

    List<Order> findAll();

    List<OrderExtend> findAllWithUser();

    public Order findOrderById(Long id);

    public void saveOrupdateOrder(Order order);

    public void deleteOrderById(Long id);
}
