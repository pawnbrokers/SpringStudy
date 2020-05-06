package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {


    List<User> selectUsers();

    //添加一个用户
    int insertUsers(User user);


    //删除一个用户
    int deleteUsers(int id);

}