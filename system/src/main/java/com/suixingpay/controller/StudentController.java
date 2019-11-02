package com.suixingpay.controller;

import com.suixingpay.model.common.Result;
import com.suixingpay.model.po.Student;
import com.suixingpay.model.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/*
*增：url:/student
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectById")
    @ResponseBody
    public String selectById(int sudentid,Model model){
        model.addAttribute("student",studentService.selectStudentById(sudentid));
        return "student";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String select(Model model){
        model.addAttribute("studentList",studentService.selectStudent());
        return "index";
    }

    @RequestMapping("/alert")
    @ResponseBody
    public Result alert(Student student) {
        int code = studentService.alertStudent(student);
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
