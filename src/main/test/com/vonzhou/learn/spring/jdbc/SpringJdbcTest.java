package com.vonzhou.learn.spring.jdbc;

import com.vonzhou.learn.domain.user.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @version 2017/8/4.
 */
public class SpringJdbcTest {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("service-context.xml"));
        UserService userService = (UserService) factory.getBean("userService");

        User u = new User();
        u.setName("vz");
        u.setAge(27);
        u.setSex("Male");


        userService.save(u);
    }
}
