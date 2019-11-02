package com.suixingpay.model.services;

import com.suixingpay.model.po.Administrator;
import org.springframework.stereotype.Service;

/*
 *@作者：周波
 * 日期：2019.11.2
 * 内容：登录验证
 */
@Service
public interface LoginService {

    public int login(Administrator admin);
}
