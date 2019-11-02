package com.suixingpay.model.services;

import com.suixingpay.model.mapper.AdministratorMapper;
import com.suixingpay.model.po.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Resource
    private AdministratorMapper administratorMapper;
    @Override
    public int judgeRoot(Administrator root) {
        if (!"root".equals(root.getUsername())) {
            return -1;
        }
        Administrator rootJudge = administratorMapper.getAdminData("root");
        if (rootJudge.getPassword().equals(root.getPassword())) {
            return rootJudge.getId();
        }
        return -1;
    }

    @Override
    public int register(Administrator admin) {
        if (administratorMapper.addAdminData(admin) <= 0) {
            return 0;
        }
        return administratorMapper.getAdminData(admin.getUsername()).getId();
    }
}
