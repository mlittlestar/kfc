package com.briup.app.kfc.web.controller;


import com.briup.app.kfc.bean.Extend.ProductExtend;
import com.briup.app.kfc.bean.Product;
import com.briup.app.kfc.service.IProductService;
import com.briup.app.kfc.utils.Message;
import com.briup.app.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Product> list=productService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findProductById")
    public Message findProductById(Long id){
        Product product=productService.findProductById(id);
        return MessageUtil.success(product);
    }

    @GetMapping("findAllWithCategory")
    public Message findAllWithCategory(){
        List<ProductExtend> list=productService.findAllWithCategory();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrupdateProduct")
    public Message saveOrupdateProduct(Product product){
        productService.saveOrupdateProduct(product);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteProductById")
    public Message deleteProductById(Long id){
        productService.deleteProductById(id);
        return MessageUtil.success("success");
    }
}
