package com.example.xiaoshuo.entity;

import lombok.Data;

@Data
public class NovelContent extends BaseEntity{
    private Integer id;
    private Integer novelId;
    private String chapter;
    private String chapterName;
    private String content;
}
