package com.yaopingping.mybatis;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Select("select * from user where id =#{id}")
    User selectUserById(int id);

    @Insert("insert into user(name,website,phone)values(#{name},#{website},#{phone})")
    void insertUser(User user);

    @Update("update user set name=#{name},website=#{website},phone=#{phone} where id=#{id} ")
    void updateUserById(User user);

    @Delete("delete user where id =#{id}")
    void deleteUser(int id);

}
