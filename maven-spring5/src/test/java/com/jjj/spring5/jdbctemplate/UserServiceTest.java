package com.jjj.spring5.jdbctemplate;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.ArrayList;

/**
 * @className: com.jjj.spring5.jdbctemplate.UserServiceTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-03 21:54
 */
@SpringJUnitConfig(locations = "classpath:jdbctemplatebean.xml")
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void test1() {
        userService.getUserNum();
    }
    @Test
    public void test2() {
        userService.getUser();
    }
    @Test
    public void test3() {
        userService.getUsers();
    }
    @Test
    public void test4() {
        userService.insertUser(new User("账户1","123456"));
    }
    @Test
    public void test5() {
        userService.deleteUser(2);
    }
    @Test
    public void test6() {
        userService.updateUser(new User("admin", "1122"));
    }
    @Test
    public void test7() {
        ArrayList<Object[]> args = new ArrayList<>();
        args.add(new Object[] {"账户2", "122222"});
        args.add(new Object[] {"账户3", "123322"});
        args.add(new Object[] {"账户4", "124422"});
        userService.batchInsertUser(args);
    }
}
