package com.vonzhou.learn.spring.jdbc;

import com.vonzhou.learn.domain.user.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @version 2017/8/4.
 */
public class UserRowMapper implements RowMapper {
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User u = new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"), resultSet.getString("sex"));
        return u;
    }
}
