package com.briup.app.kfc.service;

import com.briup.app.kfc.bean.Role;


import java.util.List;

public interface IRoleService {

    List<Role> findAll();

    public Role findRoleById(Long id);

    public void saveOrupdateRole(Role role);


    public void deleteRoleById(Long id);
}
