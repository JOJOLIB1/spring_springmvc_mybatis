package com.jjj.spring5.ioc;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @className: com.jjj.spring5.Demo6
 * @description:
 * @author: 江骏杰
 * @create: 2022-08-31 14:37
 */
public class Demo6 {
    public String[] getArrays() {
        return arrays;
    }

    public List<Demo1> getList() {
        return list;
    }

    public Set<String> getSet() {
        return set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    private String[] arrays;
    private List<Demo1> list;
    private Set<String> set;
    private Map<String, String> map;

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<Demo1> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
