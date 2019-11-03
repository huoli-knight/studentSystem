package com.suixingpay.controller;

import com.suixingpay.model.common.Result;
import com.suixingpay.model.po.S_grade;
import com.suixingpay.model.po.Student;
import com.suixingpay.model.services.CourseService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
*增url:/grade/add
*删URL：/grade/delete
* 改url: /grade/alert
* 查URL：/grade/find
*@Author:
 */
@Controller
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    CourseService courseService;

    @RequestMapping("/select")
    public String selectCourseById(int id, Model model){
        model.addAttribute("courseList",courseService.selectCourseById(id));
        return "course";
    }

    @RequestMapping("/alert")
    @ResponseBody
    public Result alert(S_grade s_grade) {
        int code = courseService.alertCourseById(s_grade);
        return result(code);
    }
    private Result result(int code) {
        String message = "系统异常!";
        if (code == 1) {
            message = "成功!";
        }
        return new Result(code, message, -1);
    }
}
