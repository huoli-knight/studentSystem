package com.suixingpay;

import com.suixingpay.model.po.Administrator;
import com.suixingpay.model.services.LoginService;
import com.suixingpay.model.services.RegisterService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
*@Author: 周波
* 测试登录 及 注册
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class LoginTest {

    @Autowired
    private LoginService loginService;

    @Autowired
    private RegisterService registerService;

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
    public void login() {
        admin.setUsername("admin1");
        admin.setPassword("1111");
        System.out.println(registerService.register(admin));
        System.out.println(loginService.login(admin));
    }
}