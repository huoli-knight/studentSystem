package com.suixingpay;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.suixingpay.model.po.Administrator;
import com.suixingpay.model.services.CourseService;
import com.suixingpay.model.services.LoginService;
import com.suixingpay.model.services.RegisterService;
import com.suixingpay.model.services.StudentService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Mrs.Wang
 * @create 2019-11-03 17:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class deleteTest {
    @Autowired
    StudentService studentService;


    private Administrator admin = new Administrator();;

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

    @Test
    public void delete() {
      System.out.println(studentService.delete(1));
    }
}
