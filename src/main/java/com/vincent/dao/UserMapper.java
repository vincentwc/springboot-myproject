package com.vincent.dao;

import com.vincent.bean.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectUsers();

    @Select("select * from user where id = #{id}")
    User findById(int id);
}
