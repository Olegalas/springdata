package com.dexter.spring.data.controller;

import com.dexter.spring.data.model.first.User;
import com.dexter.spring.data.service.first.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    public User getUser(String name, String pass){
        return userService.getUser(name, pass);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User saveUser(String name, String pass){
        return userService.saveUser(name, pass);
    }

}
