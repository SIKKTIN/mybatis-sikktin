package com.sikktin.mybatis.mapper;

import com.sikktin.mybatis.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectList();
}
