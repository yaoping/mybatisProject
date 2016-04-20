package com.yaopingping.mybatis;

import org.apache.ibatis.session.SqlSession;

public class UserDao {
    public void save(User user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    public User select(int id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(id);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }

    public void update(User user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUserById(user);
        sqlSession.commit();
        sqlSession.close();
    }

    public void delete(int id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser(id);
        sqlSession.commit();
        sqlSession.close();
    }
}
