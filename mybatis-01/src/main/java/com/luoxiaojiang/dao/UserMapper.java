package com.luoxiaojiang.dao;

import com.luoxiaojiang.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(String id);
}
