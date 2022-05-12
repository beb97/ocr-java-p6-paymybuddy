package com.beb97.p6.controller;

import com.beb97.p6.model.User;
import com.beb97.p6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAll() {
        return userService.getAll();
    }


    @GetMapping("/add")
    public ResponseEntity<Object> add() {
        userService.add();
        return ResponseEntity.noContent().build();
    }

}
