package com.kuang.service;

import com.kuang.dao.UserDao;

public class UserServiceImpl implements UserService{

    //先前的方式，我们面向对象编程，将类写死，调用具体的方法
    //private UserDao userDao = new UseOraclelImpl();

    //现在我们利用接口+ set注入的方式
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUsers() {
        userDao.getUsers();
    }
}
