package com.briup.app.kfc.web.controller;

import com.briup.app.kfc.bean.Extend.UserRoleExtend;
import com.briup.app.kfc.bean.UserRole;
import com.briup.app.kfc.service.IUserRoleService;
import com.briup.app.kfc.utils.Message;
import com.briup.app.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userrole")
public class UserRoleController {

    @Autowired
    private IUserRoleService userRoleService;

    @GetMapping("findAll")
    public Message findAll(){
        List<UserRole> list=userRoleService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findAllWithUserAndRole")
    public Message findAllWithUserAndRole(){
        List<UserRoleExtend> list=userRoleService.findAllWithUserAndRole();
        return MessageUtil.success(list);
    }


    @GetMapping("findUserRoleById")
    public Message findUserRoleById(Long id){
        UserRole userRole=userRoleService.findUserRoleById(id);
        return MessageUtil.success(userRole);
    }

    @PostMapping("saveOrupdateUserRole")
    public Message saveOrupdateUserRole(UserRole userRole){
        userRoleService.saveOrupdateUserRole(userRole);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteUserRoleById")
    public Message deleteUserRoleById(Long id){
        userRoleService.deleteUserRoleById(id);
        return MessageUtil.success("success");
    }
}
