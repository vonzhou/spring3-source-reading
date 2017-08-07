package com.vonzhou.learn.mybatis;

import com.vonzhou.learn.domain.user.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * 单独使用 mybatis
 * @version 2017/8/7.
 */
public class UserMapperTest {

    @Test
    public void add() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setName("vzhou");
            user.setAge(22);
            user.setSex("M");

            userMapper.insertUser(user);
            sqlSession.commit();
        } catch (Exception e) {

        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void query() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(1);
            System.out.println("user name : " + user.getName());
        } finally {
            sqlSession.close();
        }
    }

}
