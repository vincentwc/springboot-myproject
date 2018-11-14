package com.vincent.service;

import com.vincent.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    User findBVyId(int id);
}
