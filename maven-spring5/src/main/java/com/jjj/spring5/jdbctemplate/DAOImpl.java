package com.jjj.spring5.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
