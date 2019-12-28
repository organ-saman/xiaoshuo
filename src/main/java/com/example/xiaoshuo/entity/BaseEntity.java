package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Date createTime;
    private Date updateTime;
}
