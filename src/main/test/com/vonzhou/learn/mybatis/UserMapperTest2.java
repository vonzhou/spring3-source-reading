package com.vonzhou.learn.mybatis;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用 spring-mybatis
 * @version 2017/8/7.
 */
public class UserMapperTest2 {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("service-context.xml");
        UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
        System.out.println(userMapper.getUser(1));
    }
}
