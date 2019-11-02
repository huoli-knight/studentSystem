package com.suixingpay.controller;

import com.suixingpay.model.po.Student;
import com.suixingpay.model.services.StudentServiceImpl;
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
    StudentServiceImpl studentServiceImpl;

    @RequestMapping("/selectById")
    @ResponseBody
    public String selectById(int sudentid,Model model){
        model.addAttribute("student",studentServiceImpl.selectStudentById(sudentid));
        return "student";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String select(Model model){
        model.addAttribute("studentList",studentServiceImpl.selectStudent());
        return "index";
    }
}
