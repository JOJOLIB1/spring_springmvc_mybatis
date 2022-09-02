package com.jjj.spring5.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @className: com.jjj.spring5.aop.Principle
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-02 8:12
 */
public class Principle {

    public static void main(String[] args) {
        // 需要向下转型成接口,否则类型转换异常
        Inf instance = ((Inf) Proxy.newProxyInstance(Principle.class.getClassLoader(), new Class[]{Inf.class}, new Demo2(new Demo1())));
        System.out.println(instance.add());
    }
}
// 待增强类
interface Inf {
    public abstract int add();
}
class Demo1 implements Inf{
    public int add() {
        System.out.println("add.....");
        return 0;
    }
}
class Demo2 implements InvocationHandler {
    public Demo1 demo1;
    public Demo2(Demo1 demo1) {
        this.demo1 = demo1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        Object res = method.invoke(demo1, args);
        System.out.println("后置通知");
        return res;
    }
}

