package com.suixingpay.controller;

import com.suixingpay.model.common.Result;
import com.suixingpay.model.po.Administrator;
import com.suixingpay.model.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@作者：周波
 * 日期：2019.11.2
 * 内容：注册管理员账号
 */

@Controller
@RequestMapping("/register")
public class Register {

    @Autowired
    private RegisterService registerService;

    /*
    *注册
    * 参数 Administrator 注册用户名，密码
     */
    @RequestMapping("/register")
    public Result register(Administrator admin) {
        int adminId = registerService.register(admin);
        return result(adminId);
    }

    private Result result(int adminId) {
        int code = 0;
        String message = "系统异常！";
        if (adminId > 0) {
            code = 1;
            message = "注册成功!";
        }
        Result result = new Result(code, message, adminId);
        return result;
    }

}
