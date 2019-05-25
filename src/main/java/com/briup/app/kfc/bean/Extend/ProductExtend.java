package com.briup.app.kfc.bean.Extend;

import com.briup.app.kfc.bean.Category;
import com.briup.app.kfc.bean.Product;

public class ProductExtend extends Product {

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
