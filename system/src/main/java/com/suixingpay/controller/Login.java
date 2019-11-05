package com.suixingpay.controller;

/*
 *@作者：周波
 * 日期：2019.11.2
 * 内容：登录验证
 */

import com.suixingpay.model.common.Result;
import com.suixingpay.model.po.Administrator;
import com.suixingpay.model.services.LoginService;
import com.suixingpay.model.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Login {

    @Autowired
    private LoginService loginService;
    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/start")
    public ModelAndView start() {
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    /*
    *登录验证
    * 参数：Administrator 用户名，密码
     */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(Administrator admin) {
        int adminId = loginService.login(admin);
        Result result = result(adminId);
        result.setRedirect("student_index");
        return result;
    }

    /*
     *ROOT验证
     * 参数：Administrator ROOT用户名，密码
     */
    @RequestMapping("/registerjudge")
    @ResponseBody
    public Result registerJudge(Administrator root) {
        int adminId = registerService.judgeRoot(root);
        Result result = result(adminId);
        result.setRedirect("register");
        return result;
    }

    private Result result(int adminId) {
        int code = -1;
        String message = "用户名或密码错误!";
        if (adminId > 0) {
            code = 1;
            message = "root权限获取成功!";
        }
        if (adminId == 0) {
            code = 0;
            message = "系统异常！";
        }
        Result result = new Result(code, message, adminId);
        return result;
    }


}
