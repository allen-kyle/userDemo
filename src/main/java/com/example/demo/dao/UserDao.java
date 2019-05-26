package com.example.demo.dao;

import com.example.demo.model.PO.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {
    @Insert("insert into user(id,username, password) values(#{id},#{username}, #{password})")
    int addUser(User user);

    @Select("select * from user where username = #{username}")
    User getName(String username);

    @Delete("delete from user where username = #{username} and password = #{password}")
    void delUser(User user);

    @Update("update user set password = #{password} where username = #{username}")
    int updatePwd(User user);
}
