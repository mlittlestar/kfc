package com.briup.app.kfc.service.impl;

import com.briup.app.kfc.bean.Extend.OrderExtend;
import com.briup.app.kfc.bean.Order;
import com.briup.app.kfc.bean.OrderExample;
import com.briup.app.kfc.mapper.Extend.OrderExtendMapper;
import com.briup.app.kfc.mapper.OrderMapper;
import com.briup.app.kfc.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private OrderExtendMapper orderExtendMapper;

    @Override
    public List<Order> findAll() {
        OrderExample example=new OrderExample();
        List<Order> list=orderMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<OrderExtend> findAllWithUser() {
        return orderExtendMapper.selectAll();
    }

    @Override
    public Order findOrderById(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateOrder(Order order) {
        if(order.getId()!=null){
            orderMapper.updateByPrimaryKey(order);
        }else {
            orderMapper.insert(order);
        }
    }

    @Override
    public void deleteOrderById(Long id) {
        orderMapper.deleteByPrimaryKey(id);
    }
}
