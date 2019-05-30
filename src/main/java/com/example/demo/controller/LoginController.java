package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/register")
    public  String loginVerify(Good good){
        Date date = new Date();
        good.setCreateTime(date);
        good.setUpdateTime(date);
        good.setDeleteFlag(0);

//        String encryptPassword =  MD5Util.computeMD5(user.getPassword());
//        user.setPassword(encryptPassword);


        userDao.addGood(good);
        System.out.println("good = [" + good + "]");
        return "{\"status\":\"ok\"}";
          }

    @RequestMapping("/select")
     public Good getPrice(String goods){



        Good good = userDao.getPrice(goods);

        return good;
     }

    @PostMapping("/updatePrice")
    public  String updatePrice(Good good){

        Date date = new Date();
        good.setCreateTime(date);
        good.setUpdateTime(date);
        good.setDeleteFlag(0);

        userDao.updatePrice(good);
        System.out.println("更改价格成功 = [" + good + "]");
        return "{\"status\":\"ok\"}";
    }


    @PostMapping("/delGood")
    public  String delGood(Good good){

        Date date = new Date();
        good.setCreateTime(date);
        good.setUpdateTime(date);
        good.setDeleteFlag(0);

       userDao.delGood(good);
        System.out.println("删除成功 = [" + good + "]");
        return "{\"status\":\"ok\"}";
    }


}

