package com.example.jenkins.dao;

import com.example.jenkins.model.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDao {

    public Flux<User> getAllUsers(){
        List<User> list = Arrays.asList(new User(1, "Subham" , 24),
                new User(2, "Pritish" , 25));
        return Flux.fromIterable(list);
    }
}
