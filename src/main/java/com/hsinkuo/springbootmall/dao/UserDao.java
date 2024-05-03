package com.hsinkuo.springbootmall.dao;

import com.hsinkuo.springbootmall.dto.UserRegisterRequest;
import com.hsinkuo.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
