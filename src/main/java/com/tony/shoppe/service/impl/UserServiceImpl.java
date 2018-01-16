package com.tony.shoppe.service.impl;

import com.tony.shoppe.bean.User;
import com.tony.shoppe.dao.UserMapper;
import com.tony.shoppe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tony on 2018/1/16.
 * com.tony.shoppe.service.impl.ShopAdministration
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void getUser() {
            User a = userMapper.selectByPrimaryKey("a");
            System.out.println(a.toString());
    }
}
