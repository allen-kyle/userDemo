package com.example.demo.dao;

import com.example.demo.model.PO.Good;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {
    @Insert("insert into goodsinfo(goods, price,createTime,createUserId,updateTime,updateUserId,deleteFlag) " +
            "values(#{goods}, #{price},#{createTime},#{createUserId},#{updateTime},#{updateUserId},#{deleteFlag})")
    int addGood(Good good);

    @Select("select price from goodsinfo where goods = #{goods}")
    String getPrice(String goods);

    @Delete("delete from goodsinfo where goods = #{goods} and price = #{price}")
    int delGood(Good good);

    @Update("update goodsinfo set price = #{price} where goods = #{goods}")
    int updatePrice(Good good);
}
