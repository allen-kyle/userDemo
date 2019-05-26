package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/register")
    public  String loginVerify(User user){

        userDao.addUser(user);
        System.out.println("user = [" + user + "]");
        return "{\"status\":\"ok\"}";
          }

    @RequestMapping("/select")
     public User getName(String username){

        User user1 = userDao.getName(username);
        return user1;
     }

    @PostMapping("/updatePwd")
    public  String updatePwd(User user){

        userDao.updatePwd(user);
        System.out.println("更改密码成功 = [" + user + "]");
        return "{\"status\":\"ok\"}";
    }


    @PostMapping("/delUser")
    public  String delUser(User user){

       userDao.delUser(user);
        System.out.println("删除成功 = [" + user + "]");
        return "{\"status\":\"ok\"}";
    }


}

