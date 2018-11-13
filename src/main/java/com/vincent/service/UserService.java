package com.vincent.service;

import com.vincent.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser(int pageNum, int pageSize);

    User findBVyId(int id);
}
