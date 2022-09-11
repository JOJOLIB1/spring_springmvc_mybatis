package com.jjj.mvc.controller;

import com.jjj.mvc.pojo.Employee;
import com.jjj.mvc.pojo.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className: com.jjj.mvc.controller.ConvertController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-10 16:43
 */
@Controller
public class ConvertController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println(requestBody);
        return "success";
    }
    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        System.out.println(requestEntity.getHeaders());
        System.out.println(requestEntity.getUrl());
        System.out.println(requestEntity.getBody());
        return "success";
    }
    @ResponseBody
    @RequestMapping("/testResponseBody")
    public String testResponseBody() {
        return "中文";
    }
    @ResponseBody
    @RequestMapping("/testResponseBodyJson")
    public Employee testResponseBodyJson() {
        return new Employee(1001, "中文", "email", 1);
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username, String password){
        System.out.println(username + password);
        return "ajax";
    }
}
