package com.jjj.mvc.controller;

import com.jjj.mvc.dao.EmployeeDAO;
import com.jjj.mvc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    @DeleteMapping("/employee/{id}")
    public String deleteeEmp(@PathVariable("id") Integer id) {
        dao.delete(id);
        return "redirect:/employee";
    }

    @PostMapping("/employee")
    public String addEmp(Employee employee) {
        dao.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/employee_update/{id}")
    public ModelAndView getMessage(@PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("employee_update");
        mv.addObject("message", dao.get(id));
        return mv;
    }

    @PutMapping("/employee")
    public String updateEmp(Employee employee) {
        dao.save(employee);
        return "redirect:/employee";
    }
}
