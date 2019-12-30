package com.example.xiaoshuo.dao;

import com.example.xiaoshuo.entity.PersonInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonInfoDao {
    PersonInfo selectOneByUserInfoId(@Param("UserInfoId")Integer UserInfoId);
    Integer insertOne(@Param("PersonInfo") PersonInfo personInfo);
}
