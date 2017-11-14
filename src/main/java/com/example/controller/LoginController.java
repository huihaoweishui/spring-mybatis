package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆控制器
 */
@Controller
@RequestMapping(value = "/")
public class LoginController {

    @RequestMapping(value = "/")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/home")
    public String home(User user) {
        return "home";
    }
}
