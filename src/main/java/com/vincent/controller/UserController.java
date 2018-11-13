package com.vincent.controller;

import com.github.pagehelper.PageHelper;
import com.vincent.bean.User;
import com.vincent.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public Object finaAllUser(int pageNum, int pageSize) {
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        return userService.findAllUser(pageNum,pageSize);
    }

    @RequestMapping("/findById")
    @ResponseBody
    public User findById(int id){
        User user = userService.findBVyId(id);
        return user;
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi(){
        return "hi";
    }


}
