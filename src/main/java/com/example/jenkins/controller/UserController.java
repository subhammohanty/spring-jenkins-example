package com.example.jenkins.controller;

import com.example.jenkins.model.User;
import com.example.jenkins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public Flux<User> getAllUsers(){
        return service.getAllUsers();
    }
}
