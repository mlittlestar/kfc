package com.briup.app.kfc.service.impl;

import com.briup.app.kfc.bean.Extend.OrderLineExtend;
import com.briup.app.kfc.bean.OrderLine;
import com.briup.app.kfc.bean.OrderLineExample;
import com.briup.app.kfc.mapper.Extend.OrderLineExtendMapper;
import com.briup.app.kfc.mapper.OrderLineMapper;
import com.briup.app.kfc.service.IOrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderLineServiceImpl implements IOrderLineService {

    @Resource
    private OrderLineMapper orderLineMapper;

    @Resource
    private OrderLineExtendMapper orderLineExtendMapper;

    @Override
    public List<OrderLine> findAll() {
        OrderLineExample example=new OrderLineExample();
        List<OrderLine> list=orderLineMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<OrderLineExtend> findAllWithOrderAndProduct() {
        return orderLineExtendMapper.selectAll();
    }



    @Override
    public OrderLine findOrderLineById(Integer id) {
        return orderLineMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateOrderLine(OrderLine orderLine) {
        if(orderLine.getId()!=null){
            orderLineMapper.updateByPrimaryKey(orderLine);
        }else{
            orderLineMapper.insert(orderLine);
        }
    }

    @Override
    public void deleteOrderLineById(Integer id) {
        orderLineMapper.deleteByPrimaryKey(id);
    }


}
