package com.briup.app.kfc.service;

import com.briup.app.kfc.bean.Extend.ProductExtend;
import com.briup.app.kfc.bean.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    List<ProductExtend> findAllWithCategory();

    public Product findProductById(Long id);

    public void saveOrupdateProduct(Product product);

    public void deleteProductById(Long id);
}
