package com.jjj.spring5.ioc;

import com.alibaba.druid.pool.DruidDataSource;
import com.jjj.spring5.ioc.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @className: com.jjj.spring4.DemoTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-30 22:38
 */

public class DemoTest {
    @Test
    public void testDemo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("demo1", Demo1.class));
    }
    @Test
    public void testDemo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("demo2", Demo2.class));
    }
    @Test
    public void testDemo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("demo3", Demo3.class));
    }
    @Test
    public void testDemo4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("demo4", Demo4.class));
    }
    @Test
    public void testDemo5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        applicationContext.getBean("demo5", Demo5.class).doSomething();
    }
    @Test
    public void testDemo5_1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        applicationContext.getBean("demo5.1", Demo5.class).doSomething();
    }
    @Test
    public void testDemo6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("demo6", Demo6.class).getList());
    }
    @Test
    public void testDemo7() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("demo7", String.class));
    }

    @Test
    public void connection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanIod.xml");
        DruidDataSource druid = applicationContext.getBean("druid", DruidDataSource.class);
        System.out.println(druid);
    }


}
