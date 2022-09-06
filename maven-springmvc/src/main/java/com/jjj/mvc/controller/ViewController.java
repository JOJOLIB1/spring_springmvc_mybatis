package com.jjj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: com.jjj.mvc.controller.ViewController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-06 22:44
 */

@Controller
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String textThymeleafView() {
        return "success";
    }
    @RequestMapping("/testInternalResourceView")
    public String textInternalResourceView() {
        return "forward:/testThymeleafView";
    }
}
