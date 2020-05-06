package com.kuang.dao;

import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {


    @Test
    public void selectUsers() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.selectUsers()) {
            System.out.println(user);
        }
    }


    @Test
    public void insertUsersTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        User user = new User(7,"华佗","888888");
        userMapper.insertUsers(user);
    }



    @Test
    public void deleteUsers(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.deleteUsers(7);
    }

}
