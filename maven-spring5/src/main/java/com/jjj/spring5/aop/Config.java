package com.jjj.spring5.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @className: com.jjj.spring5.aop.Config
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-02 8:47
 */

@Configuration
@ComponentScan(basePackages = "com.jjj.spring5.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {

}
