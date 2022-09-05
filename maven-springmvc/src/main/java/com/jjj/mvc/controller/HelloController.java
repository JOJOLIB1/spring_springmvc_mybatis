package com.jjj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: com.jjj.mvc.controller.HelloController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-05 22:17
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "index";
    }
}
