package com.coustea;

import com.coustea.Entity.Users;
import com.coustea.Mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){
        String name = "root";
        Users user = userMapper.getUsernameWithPassword(name);
        System.out.println(user);
    }

}
