package com.kuang.dao;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserMapperImpl implements UserMapper {


    private SqlSessionTemplate sqlSession;

    public UserMapperImpl(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    //我们的所有的操作都是用SqlSessionTemplate来执行
    public List<User> getUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        return users;
    }


}
