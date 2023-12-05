package com.qms.qualityPrpj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qms.qualityPrpj.Entity.User;
import com.qms.qualityPrpj.Services.UserService;

//import org.springframework.ui.Model;

@RestController
@RequestMapping("/Api/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/signup")
    public User postUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @PostMapping("/login")
    public User postUserlogin(@RequestBody User user){
        return userService.validateUser(user);
    }

}
