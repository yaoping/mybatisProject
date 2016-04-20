package com.yaopingping.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class MapperTestBase {
    private SqlSession sqlSession;

    @Before
    public void setup() {
        sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    }

    public ResultSet execute(String statement) throws SQLException {
        return sqlSession.getConnection().prepareStatement(statement).executeQuery();
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    @After
    public void teardown() {
        sqlSession.commit();
        sqlSession.close();
    }
}
