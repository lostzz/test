package com.zz.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/findLoginUser")
    public String findLoginUser(Model model){
//获取用户登录名字
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("name",name);
        return "/index.jsp";
    }
}