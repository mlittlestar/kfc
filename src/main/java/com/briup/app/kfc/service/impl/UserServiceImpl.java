package com.briup.app.kfc.service.impl;

import com.briup.app.kfc.bean.User;
import com.briup.app.kfc.bean.UserExample;
import com.briup.app.kfc.mapper.UserMapper;
import com.briup.app.kfc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        UserExample example=new UserExample();
        List<User> list=userMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<User> quary(User user) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria= example.createCriteria();

        if (user.getName() != null) {
            criteria.andNameLike("%" + user.getName() + "%");
        }
        if (user.getTelephone() != null) {
            criteria.andTelephoneLike("%" + user.getTelephone() + "%");
        }
        return userMapper.selectByExample(example);
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateUser(User user) {
        if(user.getId()!=null){
            userMapper.updateByPrimaryKey(user);
        }else {
            userMapper.insert(user);
        }
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDeleteUser(Long[] ids) {
        for(Long id:ids){
            userMapper.deleteByPrimaryKey(id);
        }
    }
}
