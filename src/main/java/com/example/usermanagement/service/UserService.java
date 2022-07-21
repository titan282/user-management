package com.example.usermanagement.service;

import com.example.usermanagement.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<UserDto> getListUser();
}
