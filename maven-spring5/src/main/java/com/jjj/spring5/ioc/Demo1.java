package com.jjj.spring5.ioc;

/**
 * @className: com.jjj.spring5.Demo1
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-30 22:34
 */
public class Demo1 {
    private String attribute1;

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "attribute1='" + attribute1 + '\'' +
                '}';
    }
}
