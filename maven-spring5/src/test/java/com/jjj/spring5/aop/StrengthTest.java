package com.jjj.spring5.aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className: com.jjj.spring4.aop.StrengthTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-02 8:57
 */
public class StrengthTest {
    @Test
    public void strength() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        ToStrength toStrength = applicationContext.getBean("toStrength", ToStrength.class);
        toStrength.toStrengthMethod();
    }
}
