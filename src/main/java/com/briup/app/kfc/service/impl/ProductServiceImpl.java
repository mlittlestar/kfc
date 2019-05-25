package com.briup.app.kfc.service.impl;

import com.briup.app.kfc.bean.Extend.ProductExtend;
import com.briup.app.kfc.bean.Product;
import com.briup.app.kfc.bean.ProductExample;
import com.briup.app.kfc.mapper.Extend.ProductExtendMapper;
import com.briup.app.kfc.mapper.ProductMapper;
import com.briup.app.kfc.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Resource
    private ProductExtendMapper productExtendMapper;

    @Override
    public List<Product> findAll() {
        ProductExample example=new ProductExample();
        List<Product> list=productMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<ProductExtend> findAllWithCategory() {
        return productExtendMapper.selectAll();
    }

    @Override
    public Product findProductById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateProduct(Product product) {
        if(product.getId()!=null){
            productMapper.updateByPrimaryKey(product);
        }else{
            productMapper.insert(product);
        }
    }

    @Override
    public void deleteProductById(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }
}
