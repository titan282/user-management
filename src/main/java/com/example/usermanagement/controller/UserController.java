package com.example.usermanagement.controller;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.model.dto.UserDto;
import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(){
        List<UserDto> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }
}
