package com.jjj.spring5;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: com.jjj.spring4.HelloSpringTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-29 15:49
 */
public class HelloSpringTest {
    @Test
    public void HelloSpringTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        applicationContext.getBean("hello", HelloSpring.class).say();
    }
}
