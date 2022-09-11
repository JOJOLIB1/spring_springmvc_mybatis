package com.jjj.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @className: com.jjj.mvc.exception.exceptionSolver
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-10 21:59
 */
@ControllerAdvice
public class ExceptionSolver {
    @ExceptionHandler(java.lang.Exception.class)
    public String success(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        return "success";
    }
}
