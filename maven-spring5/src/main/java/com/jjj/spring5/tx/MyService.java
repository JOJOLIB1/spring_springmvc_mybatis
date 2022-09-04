package com.jjj.spring5.tx;

import com.jjj.spring5.jdbctemplate.DAO;
import com.jjj.spring5.jdbctemplate.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @className: com.jjj.spring5.tx.MyService
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-04 9:09
 */
@Transactional
@Service
public class MyService {
    @Autowired
    public DAO dao;
    public void txInsert() throws SQLException {
        dao.insertUser(new User("加不进去", "123"));
        throw new SQLException();
    }
}
