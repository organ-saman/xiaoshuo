package com.example.xiaoshuo.dao;


import com.example.xiaoshuo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    UserInfo getUser(@Param("userId")String name);
    Integer insertUser(@Param("UserInfo")UserInfo userInfo);
}
