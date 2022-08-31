package com.jjj.spring5;

/**
 * @className: com.jjj.spring5.Demo4
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-31 10:51
 */
public class Demo4 {
    private String attribute1;

    private String attribute2;

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public String toString() {
        return "Demo4{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                '}';
    }
}
