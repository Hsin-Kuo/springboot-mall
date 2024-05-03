package com.hsinkuo.springbootmall.service;

import com.hsinkuo.springbootmall.dto.UserLoginRequest;
import com.hsinkuo.springbootmall.dto.UserRegisterRequest;
import com.hsinkuo.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
