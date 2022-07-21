package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<UserDto> getListUser();
    public UserDto getUserById(int id);

    List<UserDto> searchUserByParam(String name);
}
