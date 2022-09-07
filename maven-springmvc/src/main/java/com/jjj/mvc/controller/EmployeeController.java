package com.jjj.mvc.controller;

import com.jjj.mvc.dao.EmployeeDAO;
import com.jjj.mvc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * @className: com.jjj.mvc.controller.EmpleyeeController
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-07 22:59
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDAO dao;
    @GetMapping("/employee")
    public ModelAndView getAllEmp() {
        ModelAndView mv = new ModelAndView();
        Collection<Employee> list = dao.getAll();
        mv.setViewName("list");
        mv.addObject("empList", list);
        return mv;
    }
}
