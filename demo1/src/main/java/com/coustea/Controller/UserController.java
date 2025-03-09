package com.coustea.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class UserController {

    @GetMapping("/")
    public String index(){
        return "Hello!";
    }

}
