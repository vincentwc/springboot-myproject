package com.vincent.controller;

import com.vincent.bean.User;
import com.vincent.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

//  改为使用restful风格接口
//   @RequestMapping("/findById")
//    @ResponseBody
//    public User findById(int id){
//        User user = userService.findBVyId(id);
//        return user;
//    }

    @RequestMapping(value = "/findById/{id}")
    @ResponseBody
    public User findById(@PathVariable(value = "id") int id){
        User user = userService.findBVyId(id);
        return user;
    }

}
