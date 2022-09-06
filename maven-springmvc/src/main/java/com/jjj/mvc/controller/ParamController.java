package com.jjj.mvc.controller;

import com.jjj.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;

/**
 * @className: com.jjj.mvc.controller.ParamController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-06 23:21
 */
@Controller
public class ParamController {
    @RequestMapping("/testParam1")
    public String testParam1(String id,String username) {
        System.out.println(id + username);
        return "success";
    }
    @RequestMapping("/testParam2")
    public String testParam2(String id,@RequestParam("user_name") String username) {
        System.out.println(id + username);
        return "success";
    }
    @RequestMapping("/testParamAttr")
    public String testParamAttr(String id,@RequestParam(value = "user_name", required = false, defaultValue = "DEFAULT") String username) {
        System.out.println(id + username);
        return "success";
    }
    @RequestMapping("/testReqHeader")
    public String testHeader(@RequestHeader("host") String host) {
        System.out.println(host);
        return "success";
    }
    @RequestMapping("/testCookieValue")
    public String testCookie(@CookieValue("JSESSIONID") String sessionId, HttpServletRequest request) {
        request.getCookies();
        System.out.println(sessionId);
        return "success";
    }
    @RequestMapping("/testPojo")
    private String testPojo(User user) {
        System.out.println(user);
        return "success";
    }
}
