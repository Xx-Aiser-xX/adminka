package org.example.adminka.controllers;

import org.example.adminka.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        User user = new User();
        user.setId(1);
        user.setName("Alice");
        return List.of(user);
    }
}