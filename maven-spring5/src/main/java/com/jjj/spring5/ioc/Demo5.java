package com.jjj.spring5.ioc;

/**
 * @className: com.jjj.spring5.Demo5
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-31 14:21
 */
public class Demo5 {
    private Demo4 demo4;

    public Demo4 getDemo4() {
        return demo4;
    }

    public void setDemo4(Demo4 demo4) {
        this.demo4 = demo4;
    }
    public void doSomething() {
        System.out.println(demo4.toString());
    }
}
