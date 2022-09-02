package com.jjj.spring5.ioc;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @className: com.jjj.spring5.ioc.Ioc
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-02 9:40
 */
@Component
//@Service
//@Controller
//@Repository
public class Ioc {
    @Value(value = "属性值")
    private String attribute1;
//    @Autowired
//    @Qualifier(value = "id")
//    @Resource
//    @Resource(name = "id")
    private Others attribute2;

}
