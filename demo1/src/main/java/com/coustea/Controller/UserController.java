package com.coustea.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
     @GetMapping("/login")
    public String login(){
        return "login";
    }
    @ResponseBody
    @GetMapping("/index")
    public String index(){
        return "Hello Spring Security!";
    }
}
