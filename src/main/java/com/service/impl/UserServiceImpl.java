package com.service.impl;

import com.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassNmae UserServiceImpl
 * @Discription
 * @Author wh
 * @Date 2020/10/27  16:51
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String  hello(String val) {
        System.out.println("val ==>"+val);
        return val;
    }
}
