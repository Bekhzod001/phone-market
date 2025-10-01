package com.phones.demo.controller;

import com.phones.demo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser() {
        User user = new User(1L, "Bekk", "998990153464", "123");

        List<User> users = new ArrayList<>();
        users.add(user);

        return ResponseEntity.ok(users);
    }
}
