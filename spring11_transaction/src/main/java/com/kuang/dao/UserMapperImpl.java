package com.kuang.dao;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public UserMapperImpl(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }




    public List<User> selectUsers() {
        return sqlSession.getMapper(UserMapper.class).selectUsers();
    }

    public int insertUsers(User user) {
        return sqlSession.getMapper(UserMapper.class).insertUsers(user);
    }

    public int deleteUsers(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUsers(id);
    }



}
