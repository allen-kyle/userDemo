package com.example.demo.controller;

import com.example.demo.model.PO.Good;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private IGoodsService goodsService;

    @PostMapping("/register")
    public Good addGoods(Good good){
        return goodsService.addGoods(good);
    }

    @RequestMapping("/select")
     public Map getPrice(String goodsname){

          String price = goodsService.getPrice(goodsname);
        Map map = new HashMap();
        map.put("status",price);
        return map;
}

    @PostMapping("/updatePrice")
    public  String updatePrice(Good good){
        return goodsService.updatePrice(good);
    }


    @PostMapping("/delGood")
    public  int delGood(Good good){
        return goodsService.delGoods(good);
    }


}

