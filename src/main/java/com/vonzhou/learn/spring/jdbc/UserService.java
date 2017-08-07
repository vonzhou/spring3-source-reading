package com.vonzhou.learn.spring.jdbc;

import com.vonzhou.learn.domain.user.User;

import java.util.List;

/**
 * @version 2017/8/4.
 */
public interface UserService {
    void save(User user);

    List<User> getUsers();
}
