package com.example.demo.model.PO;


import com.example.demo.model.PO.base.BaseEntity;
import lombok.Data;

@Data
public class Good extends BaseEntity {

    private String goods;
    private String price;
}
