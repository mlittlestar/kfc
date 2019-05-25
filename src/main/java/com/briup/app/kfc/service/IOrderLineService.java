package com.briup.app.kfc.service;

import com.briup.app.kfc.bean.Extend.OrderLineExtend;
import com.briup.app.kfc.bean.OrderLine;

import java.util.List;

public interface IOrderLineService {

    List<OrderLine> findAll();

    List<OrderLineExtend> findAllWithOrderAndProduct();

    public OrderLine findOrderLineById(Integer id);

    public void saveOrupdateOrderLine(OrderLine orderLine);

    public void deleteOrderLineById(Integer id);
}
