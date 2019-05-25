package com.briup.app.kfc.service;


import com.briup.app.kfc.bean.Extend.UserRoleExtend;
import com.briup.app.kfc.bean.UserRole;

import java.util.List;

public interface IUserRoleService {

    List<UserRole> findAll();

    List<UserRoleExtend> findAllWithUserAndRole();

    public UserRole findUserRoleById(Long id);

    public void saveOrupdateUserRole(UserRole userRole);


    public void deleteUserRoleById(Long id);
}
