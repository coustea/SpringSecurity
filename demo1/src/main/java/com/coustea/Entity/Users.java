package com.coustea.Entity;


import lombok.Data;

@Data
public class Users {

    private Integer id;
    private String username;
    private String password;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
