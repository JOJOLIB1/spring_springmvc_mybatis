package com.jjj.spring5.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @className: com.jjj.spring5.ioc.Demo8
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-02 9:20
 */
public class Demo8 {
    public void init() {

    }
    public void destroy() {

    }
}
class handle implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
