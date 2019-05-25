package com.briup.app.kfc.web.controller;

import com.briup.app.kfc.bean.User;
import com.briup.app.kfc.service.IUserService;
import com.briup.app.kfc.utils.Message;
import com.briup.app.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("query")
    public Message query(String name,String telephone) {
        User user = new User();
        user.setName(name);
        user.setTelephone(telephone);
        System.out.println(user.getName());
        System.out.println(user.getTelephone());

        List<User> list = userService.quary(user);

        return MessageUtil.success(list);
    }

    @GetMapping("findAll")
    public Message findAll(){
        List<User> list=userService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findByUserId")
    public Message findUserById(Long id){
        User user=userService.findUserById(id);
        return MessageUtil.success(user);
    }

    @PostMapping("saveOrupdateUser")
    public Message saveOrupdateUser(User user){
        userService.saveOrupdateUser(user);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteByUserId")
    public Message deleteUserById(Long id){
        userService.deleteUserById(id);
        return MessageUtil.success("success");
    }


    @PostMapping("batchDelete")
    public Message batchDelete(@RequestBody Long[] ids){
        userService.batchDeleteUser(ids);
        return MessageUtil.success("success");
    }


}
