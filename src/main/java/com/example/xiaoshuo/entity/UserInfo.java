package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;
@Data
public class UserInfo extends BaseEntity{
    private Integer id;
    private String userId;
    private String passWord;
    private String userName;
    private Integer mark;
    private Boolean delFlag;
}
