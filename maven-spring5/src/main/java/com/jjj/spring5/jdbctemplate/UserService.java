package com.jjj.spring5.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
