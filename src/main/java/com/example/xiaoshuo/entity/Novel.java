package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Novel extends BaseEntity{
    private Integer id;
    private String novelName;
    private String novelAuthor;
    private String novelType;
    private String novelCharacter;
    private String novel;
    private Boolean delFlag;
}
