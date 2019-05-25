package com.briup.app.kfc.bean.Extend;

import com.briup.app.kfc.bean.Order;
import com.briup.app.kfc.bean.OrderLine;
import com.briup.app.kfc.bean.Product;

public class OrderLineExtend extends OrderLine {

    private Order order;

    private Product product;

    private ProductExtend productExtend;

    private OrderExtend orderExtend;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductExtend getProductExtend() {
        return productExtend;
    }

    public void setProductExtend(ProductExtend productExtend) {
        this.productExtend = productExtend;
    }

    public OrderExtend getOrderExtend() {
        return orderExtend;
    }

    public void setOrderExtend(OrderExtend orderExtend) {
        this.orderExtend = orderExtend;
    }
}
