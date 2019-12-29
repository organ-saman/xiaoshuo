package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.dao.UserDao;
import com.example.xiaoshuo.entity.UserInfo;
import com.example.xiaoshuo.service.IUserService;
import com.example.xiaoshuo.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Boolean login(UserInfo user) {
        UserInfo userInfo = userDao.getUser(user.getUserId());
        if(userInfo == null ){
            return false;
        }
        String passWord = userInfo.getPassWord();
        String md5 = MD5Util.getMD5(user.getPassWord());
        if(passWord != md5){
            return false;
        }
        return true;
    }

    @Override
    public Boolean saveUserInfo(UserInfo userInfo) {
        UserInfo user = userDao.getUser(userInfo.getUserId());
        if(user != null){
            return false;
        }else{
            String md5 = MD5Util.getMD5(userInfo.getPassWord());
            userInfo.setPassWord(md5);
            Integer integer = userDao.insertUser(userInfo);
            if(integer !=null && integer == 1){
                return true;
            }
            return false;
        }
    }
}
