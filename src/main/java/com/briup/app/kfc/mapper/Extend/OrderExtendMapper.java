package com.briup.app.kfc.mapper.Extend;

import com.briup.app.kfc.bean.Extend.OrderExtend;

import java.util.List;

public interface OrderExtendMapper {

    List<OrderExtend> selectAll();

    OrderExtend selectByPrimaryKey();
}
