package com.example.xiaoshuo.service;

import com.example.xiaoshuo.entity.UserInfo;

public interface IUserInfoService {
    Boolean login(UserInfo userInfo);
    Boolean saveUserInfo(UserInfo userInfo);
}
