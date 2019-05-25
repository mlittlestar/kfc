package com.briup.app.kfc.service;

import com.briup.app.kfc.bean.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    List<User> quary(User user);

    public User findUserById(Long id);

    public void saveOrupdateUser(User user);


    public void deleteUserById(Long id);

    void batchDeleteUser(Long[] ids);
}
