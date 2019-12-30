package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PersonInfo extends BaseEntity{
    private Integer id;
    private Integer userInfoId;
    private String userId;
    private String personName;
    private String gender;
    private Date birthday;
    private Boolean delFlag;
}
