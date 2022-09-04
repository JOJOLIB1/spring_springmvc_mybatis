package com.jjj.spring5.tx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.SQLException;

/**
 * @className: com.jjj.spring5.tx.MyServiceTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-04 9:11
 */

@SpringJUnitConfig(locations = "classpath:txBean.xml")
public class MyServiceTest {
    @Autowired
    MyService myService;
    @Test
    public void testTxInsert() throws SQLException {
        myService.txInsert();
    }
}
