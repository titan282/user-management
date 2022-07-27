package com.example.usermanagement.controller;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.model.dto.UserDto;
import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getAllUsers(){
        List<UserDto> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id){
        UserDto result = userService.getUserById(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam String name) {
        List<UserDto> result = userService.searchUserByParam(name);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestParam long id, @RequestBody User user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestParam long id){
        return userService.deleteUser(id);
    }
}
