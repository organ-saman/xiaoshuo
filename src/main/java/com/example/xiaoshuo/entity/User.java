package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private Integer id;
    private String name;
    private String userId;
    private String passWord;
    private String gender;
    private Date birthday;
    private Double score;

    public String getPassWord() {
        return passWord;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
