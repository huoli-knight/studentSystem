package com.suixingpay;


import com.suixingpay.model.po.S_grade;
import com.suixingpay.model.po.Student;
import com.suixingpay.model.services.CourseService;
import com.suixingpay.model.services.StudentService;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class Test {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    private Student student = new Student();
    private S_grade s_grade =new S_grade();

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

    @org.junit.Test
    public void alertStudent() {
        student.setEmail("123456@suixingpay.com");
        student.setSudentId("20191020");
        System.out.println(studentService.alertStudent(student));
    }

    @org.junit.Test
    public void alertGrade() {
        s_grade.setGrade(100);
        s_grade.setC_id(1);
        s_grade.setS_id(1);
        System.out.println(courseService.alertCourseById(s_grade));
    }

}
