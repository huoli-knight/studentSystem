package com.suixingpay.model.services;

import com.suixingpay.model.po.Administrator;
import org.springframework.stereotype.Service;

@Service
public interface RegisterService {

    public int judgeRoot(Administrator root);

    public int register(Administrator admin);
}
