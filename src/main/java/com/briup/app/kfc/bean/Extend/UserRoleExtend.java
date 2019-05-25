package com.briup.app.kfc.bean.Extend;

import com.briup.app.kfc.bean.Role;
import com.briup.app.kfc.bean.User;
import com.briup.app.kfc.bean.UserRole;

public class UserRoleExtend extends UserRole {

    private User user;

    private Role role;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
