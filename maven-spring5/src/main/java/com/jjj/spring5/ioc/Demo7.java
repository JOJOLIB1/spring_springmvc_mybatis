package com.jjj.spring5.ioc;

import org.springframework.beans.factory.FactoryBean;

/**
 * @className: com.jjj.spring5.Demo7
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-31 14:52
 */
public class Demo7 implements FactoryBean<String> {

    @Override
    public String getObject() throws Exception {
        return "我是指定的返回类型";
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
