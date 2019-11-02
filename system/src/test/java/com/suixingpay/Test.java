package com.suixingpay;


import com.suixingpay.model.po.Student;
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

    private Student student = new Student();

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
}
