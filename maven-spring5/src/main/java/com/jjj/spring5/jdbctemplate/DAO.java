package com.jjj.spring5.jdbctemplate;

import org.springframework.context.annotation.Bean;

import java.sql.SQLException;
import java.util.List;

/**
 * @className: com.jjj.spring5.jdbctemplate.DAO
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-03 21:24
 */
// 应该放进DAO目录中
public interface DAO {
    public abstract int getSum();
    public abstract User getBean(int id);
    List<User> getBeans();
    void insertUser(User user) throws SQLException;
    void deleteUser(int userId) throws SQLException;
    void update(User user) throws SQLException;
    void batchInsertUser(List<Object[]> args);
}
