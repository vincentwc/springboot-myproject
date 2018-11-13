package com.vincent.service.impl;

import com.github.pagehelper.PageHelper;
import com.vincent.bean.User;
import com.vincent.dao.UserMapper;
import com.vincent.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectUsers();
    }

    @Override
    public User findBVyId(int id) {
        return userMapper.findById(id);
    }
}
