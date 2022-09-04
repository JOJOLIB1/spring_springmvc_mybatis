package com.jjj.spring5.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @className: com.jjj.spring5.jdbctemplate.Service
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-03 21:39
 */

@Service
public class UserService {
    @Autowired
    DAO dao;
    public void getUserNum() {

        System.out.println(dao.getSum());

    }
    public void getUser() {
        System.out.println(dao.getBean(1));
    }
    public void getUsers() {
        System.out.println(dao.getBeans());
    }
    public void insertUser(User user) {
        try {
            dao.insertUser(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteUser(int id) {
        try {
            dao.deleteUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateUser(User user) {
        try {
            dao.update(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void batchInsertUser(List<Object[]> args) {
        dao.batchInsertUser(args);
    }

}
