package com.suixingpay.controller;

import com.suixingpay.model.common.Result;
import com.suixingpay.model.po.Student;
import com.suixingpay.model.services.StudentService;
import com.suixingpay.model.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public Student selectById(Student student){
        return studentService.selectStudentById(student);
    }

    @RequestMapping("/select")
    @ResponseBody
    public ArrayList<Student> select(){
        ArrayList<Student> student = studentService.selectStudent();
        return student;
    }

    @RequestMapping("/alert")
    @ResponseBody
    public Result alert(Student student) {
        int code = studentService.alertStudent(student);
        return result(code);
    }

    private Result result(int code) {
        String message = "学号有误!";
        if (code == 1) {
            message = "成功!";
        }
        return new Result(code, message, -1);
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    public Result addStudent(Student student){
        int code = studentService.addStudent(student);
        return result(code);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Student student) {
        int code = studentService.delete(student);
        return result(code);
    }
}
