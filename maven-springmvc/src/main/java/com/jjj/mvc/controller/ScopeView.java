package com.jjj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @className: com.jjj.mvc.controller.ScopeView
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-06 23:00
 */

@Controller
public class ScopeView {
    @RequestMapping("/testApplication")
    public String textApplication(HttpSession session) {
        session.setAttribute("app","往请求域中塞东西");
        return "scope";
    }
    @RequestMapping("/testSession")
    public String textSession(HttpSession session) {
        session.setAttribute("session", "往会话域塞东西");
        return "scope";
    }
    @RequestMapping("/testMV")
    public ModelAndView testMV() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("req", "Model and View");
        mv.setViewName("scope");
        return mv;
    }
    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("req", "Model");
        return "scope";
    }
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("req", "ModelMap");
        return "scope";
    }
    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("req", "Map");
        return "scope";
    }

}