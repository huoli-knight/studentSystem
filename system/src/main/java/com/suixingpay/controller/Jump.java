package com.suixingpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jump {

    @RequestMapping("/addAndAlert")
    public String addAndAlert() {
        return "addAndAlert";
    }

    @RequestMapping("/startLogin")
    public String start() {
        return "/login";
    }

    @RequestMapping("/student_index")
    public String toIndex(){
        return "student_index";
    }

    @RequestMapping("/register")
    public String toRegister() {
        return "register";
    }

}
