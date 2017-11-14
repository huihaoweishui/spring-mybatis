package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/toAdmin")
    public String toAdmin(Model model) {
        User user = userService.findByName("admin");
        model.addAttribute("user",user);
        return "home2"; // 加/很重要 相对根路径 否则就是相对当前路径 回去查/admin/WEB-INF/home2.jsp 404 加视图解析器 就i可以一致
    }
}
