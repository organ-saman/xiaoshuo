package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.dao.UserDao;
import com.example.xiaoshuo.entity.User;
import com.example.xiaoshuo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Boolean login(User user) {
        User userInfo = userDao.getUser(user.getName());
        if(userInfo == null ){
            return false;
        }
        String passWord = userInfo.getPassWord();
        if(passWord != user.getPassWord()){
            return false;
        }
        return true;
    }
}
