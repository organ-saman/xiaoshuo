package com.example.xiaoshuo.dao;


import com.example.xiaoshuo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    User getUser(@Param("userId")String name);

}
