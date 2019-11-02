package com.suixingpay;

import com.suixingpay.controller.StudentController;
import com.suixingpay.model.po.Course;
import com.suixingpay.model.po.S_grade;
import com.suixingpay.model.po.Student;
import com.suixingpay.model.services.CourseService;
import com.suixingpay.model.services.StudentService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class SelectTest {

    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }
    @Test
    public void select(){
        /*Student student = studentService.selectStudentById(1);
        System.out.println(student.getId());
        System.out.println(student.getName());*/
        ArrayList<S_grade> list = courseService.selectCourseById(1);
        System.out.println(list);
    }
}
