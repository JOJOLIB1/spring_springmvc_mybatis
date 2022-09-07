package com.jjj.mvc.restful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @className: com.jjj.mvc.restful.RestController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-07 22:49
 */
@Controller
public class RestController {
    @PutMapping("/testput")
    public String testPut() {
        return "success";
    }
    @DeleteMapping("/testDel")
    public String testDel() {
        return "success";
    }
}
