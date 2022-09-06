package com.jjj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @className: com.jjj.mvc.controller.ReqMappingController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-06 23:57
 */
@Controller
@RequestMapping("/begin")
public class ReqMappingController {
    @RequestMapping("/**/ant1")
    public String ant1() {
        return "success";
    }
    @RequestMapping("/ant2*")
    public String ant2() {
        return "success";
    }
    @RequestMapping("/ant3?")
    public String ant3() {
        return "success";
    }
    @RequestMapping("/placeHolder/{id}/{username}")
    public String placeHolder(@PathVariable("id") String id, @PathVariable("username") String username) {
        System.out.println(id + username);
        return "success";
    }

    @RequestMapping({"/test1", "/test2", "/test3"})
    public String test() {
        return "success";
    }
    @RequestMapping(value = "/test4", method = {RequestMethod.POST})
    public String test2() {
        return "success";
    }
    @RequestMapping(value = "/test5", params = {"a", "!b", "c=2", "d!=3"}, headers = "host")
    public String test3() {
        // headers同理
        return "success";
    }
}