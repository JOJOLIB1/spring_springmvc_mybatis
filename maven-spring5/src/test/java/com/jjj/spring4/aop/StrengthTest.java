package com.jjj.spring4.aop;

import com.jjj.spring5.aop.Config;
import com.jjj.spring5.aop.Strength;
import com.jjj.spring5.aop.ToStrength;
import org.junit.Test;
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
