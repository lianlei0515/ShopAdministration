package com.tony.shoppe.controller;

import com.tony.shoppe.service.UserService;
import com.tony.shoppe.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Tony on 2018/1/16.
 * com.tony.shoppe.controller.ShopAdministration
 * 描述：
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public void getUser(){
        userService.getUser();
    }

}
