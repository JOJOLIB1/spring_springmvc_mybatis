package com.jjj.spring5.jdbctemplate;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

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
}
