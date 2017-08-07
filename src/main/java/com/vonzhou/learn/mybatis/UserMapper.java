package com.vonzhou.learn.mybatis;

import com.vonzhou.learn.domain.user.User;

/**
 * @version 2017/8/7.
 */
public interface UserMapper {
    void insertUser(User user);

    User getUser(Integer id);
}
