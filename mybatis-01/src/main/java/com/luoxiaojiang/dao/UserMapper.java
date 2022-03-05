package com.luoxiaojiang.dao;

import com.luoxiaojiang.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(String id);
    int insertUser(User user);
    int updateUser(User user);
    int delUser(String id);
}
