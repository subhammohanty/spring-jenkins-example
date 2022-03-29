package com.example.jenkins.service;

import com.example.jenkins.dao.UserDao;
import com.example.jenkins.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public Flux<User> getAllUsers(){
        return dao.getAllUsers();
    }
}
