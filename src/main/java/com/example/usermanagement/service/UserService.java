package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //GET
    public List<UserDto> getListUser();
    public UserDto getUserById(int id);

    List<UserDto> searchUserByParam(String name);

    //POST thêm một User
    public User addUser(User user);

    //PUT update một user
    public User updateUser(long id, User user);

    //DELETE một user
    public boolean deleteUser(long id);
}
