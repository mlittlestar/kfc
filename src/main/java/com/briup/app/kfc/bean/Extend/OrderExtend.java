package com.briup.app.kfc.bean.Extend;

import com.briup.app.kfc.bean.Order;
import com.briup.app.kfc.bean.User;

public class OrderExtend extends Order {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
