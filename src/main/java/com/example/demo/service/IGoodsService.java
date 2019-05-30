package com.example.demo.service;

import com.example.demo.model.PO.Good;

public interface IGoodsService {
    Good addGoods(Good good);

    int delGoods(Good good);

    String getPrice(String goodsname);

    String updatePrice(Good good);
}
