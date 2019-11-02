package com.suixingpay.controller;

import com.suixingpay.model.po.S_grade;
import com.suixingpay.model.services.CourseService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
