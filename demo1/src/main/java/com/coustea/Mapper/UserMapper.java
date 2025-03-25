package com.coustea.Mapper;


import com.coustea.Entity.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Users getUsernameWithPassword(String name);

    void insertUser(Users user);
}
