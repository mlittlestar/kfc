package com.briup.app.kfc.mapper.Extend;

import com.briup.app.kfc.bean.Extend.ProductExtend;

import java.util.List;

public interface ProductExtendMapper {

    List<ProductExtend> selectAll();

    ProductExtend selectByPrimaryKey(Long id);
}
