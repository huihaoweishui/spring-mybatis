package com.example.mapper;

import com.example.entity.User;

public interface UserMapper {

    User findByName(String name);
}
