package com.hsinkuo.springbootmall.service.impl;

import com.hsinkuo.springbootmall.dao.UserDao;
import com.hsinkuo.springbootmall.dto.UserRegisterRequest;
import com.hsinkuo.springbootmall.model.User;
import com.hsinkuo.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
