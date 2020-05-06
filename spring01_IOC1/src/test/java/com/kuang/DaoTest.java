package com.kuang;

import com.kuang.dao.UserMySQLImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    @Test
    public void TestDao(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(new UserMySQLImpl());

        service.getUsers();
    }



    @Test
    public void testIoC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUsers();
    }

}
