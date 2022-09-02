package com.jjj.spring5.ioc;

/**
 * @className: com.jjj.spring5.Demo2
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-30 22:42
 */
public class Demo2 {
    private String attribute1;

    public Demo2(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public String toString() {
        return "Demo2{" +
                "attribute1='" + attribute1 + '\'' +
                '}';
    }
}
