package com.jjj.spring5.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @className: com.jjj.spring5.jdbctemplate.DAOImpl
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-03 21:25
 */
@Repository
public class DAOImpl implements DAO{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int getSum() {
        String sql = "SELECT COUNT(1) FROM user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public User getBean(int id) {
        String sql = "SELECT username,userpwd userPwd FROM user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public List<User> getBeans() {
        String sql = "SELECT username,userpwd userPwd FROM user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public void insertUser(User user) throws SQLException {
        String sql = "INSERT INTO user(username,userpwd) VALUES(?, ?)";
        int update = jdbcTemplate.update(sql, user.userName, user.userPwd);
        if (update == 0) {
            throw new SQLException("加入失败");
        }else {
            System.out.println("添加成功");
        }
    }

    @Override
    public void deleteUser(int userId) throws SQLException {
        String sql = "DELETE FROM user WHERE id = ?";
        int update = jdbcTemplate.update(sql, userId);
        if (update == 0) {
            throw new SQLException("删除失败");
        }else {
            System.out.println("删除成功");
        }
    }

    @Override
    public void update(User user) throws SQLException {
        String sql = "UPDATE user SET username = ?, userpwd = ? WHERE username = ?";
        int update = jdbcTemplate.update(sql, user.userName, user.userPwd, user.userName);
        if (update == 0) {
            throw new SQLException("更新失败");
        }else {
            System.out.println("更新成功");
        }
    }

    @Override
    public void batchInsertUser(List<Object[]> args) {
        String sql = "INSERT INTO user(username,userpwd) VALUES(?, ?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 1) {
                System.out.println("第" + (i + 1) + "个操作成功");
            }
        }
    }
}
