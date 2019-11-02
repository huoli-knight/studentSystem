package com.suixingpay.model.services;

import com.suixingpay.model.mapper.AdministratorMapper;
import com.suixingpay.model.po.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@作者：周波
 * 日期：2019.11.2
 * 内容：登录验证
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public int login(Administrator admin) {
        Administrator adminJudge = administratorMapper.getAdminData(admin.getUsername());
        if (admin.getPassword().equals(adminJudge.getPassword())) {
            return adminJudge.getId();
        }
        return -1;
    }
}
