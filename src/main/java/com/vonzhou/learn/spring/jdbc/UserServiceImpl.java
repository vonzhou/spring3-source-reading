package com.vonzhou.learn.spring.jdbc;

import com.vonzhou.learn.domain.user.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * @version 2017/8/4.
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDatasource(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    public void save(User user) {
        jdbcTemplate.update("INSERT  INTO  user(name,age,sex) VALUEs (?,?,?)",
                            new Object[] {user.getName(), user.getAge(), user.getSex()},
                            new int[] {Types.VARCHAR, Types.INTEGER, Types.VARCHAR});
    }

    public List<User> getUsers() {
        return jdbcTemplate.query("select *from user", new UserRowMapper());
    }
}
