package com.briup.app.kfc.service.impl;

import com.briup.app.kfc.bean.Extend.UserRoleExtend;
import com.briup.app.kfc.bean.UserRole;
import com.briup.app.kfc.bean.UserRoleExample;
import com.briup.app.kfc.mapper.Extend.UserRoleExtendMapper;
import com.briup.app.kfc.mapper.UserRoleMapper;
import com.briup.app.kfc.service.IUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService {


    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private UserRoleExtendMapper userRoleExtendMapper;

    @Override
    public List<UserRole> findAll() {
        UserRoleExample example=new UserRoleExample();
        List<UserRole> list=userRoleMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<UserRoleExtend> findAllWithUserAndRole() {
        return userRoleExtendMapper.selectAll();
    }

    @Override
    public UserRole findUserRoleById(Long id) {
        return userRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateUserRole(UserRole userRole) {
        if(userRole.getId()!=null){
            userRoleMapper.updateByPrimaryKey(userRole);
        }else {
            userRoleMapper.insert(userRole);
        }
    }

    @Override
    public void deleteUserRoleById(Long id) {
        userRoleMapper.deleteByPrimaryKey(id);
    }
}
