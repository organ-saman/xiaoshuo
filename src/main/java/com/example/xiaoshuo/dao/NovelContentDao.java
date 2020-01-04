package com.example.xiaoshuo.dao;

import com.example.xiaoshuo.entity.NovelContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NovelContentDao {
    NovelContent selectOne(@Param("novelId")Integer novelId);
}
