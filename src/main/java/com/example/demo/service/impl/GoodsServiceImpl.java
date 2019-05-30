package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.Good;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private UserDao userDao;

    @Override
    public Good addGoods(Good good) {
        Date date = new Date();
        good.setCreateTime(date);
        good.setUpdateTime(date);
        good.setDeleteFlag(0);

        userDao.addGood(good);
        System.out.println("good = [" + good + "]");
        return good;
    }

    @Override
    public int delGoods(Good good) {

        Date date = new Date();
        good.setCreateTime(date);
        good.setUpdateTime(date);
        good.setDeleteFlag(0);

        System.out.println("删除成功 = [" + good + "]");
        return  userDao.delGood(good);
    }

    @Override
    public String getPrice(String goodsname) {

        String price = userDao.getPrice(goodsname);

        return price;
    }

    @Override
    public String updatePrice(Good good) {

        Date date = new Date();
        good.setCreateTime(date);
        good.setUpdateTime(date);
        good.setDeleteFlag(0);

        userDao.updatePrice(good);
        System.out.println("更改价格成功 = [" + good + "]");
        return "{\"status\":\"ok\"}";
    }
}
