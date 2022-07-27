package com.example.usermanagement.model.mapper;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.model.dto.UserDto;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto temp = new UserDto();
        temp.setId(user.getId());
        temp.setName(user.getName());
        temp.setAvatar(user.getAvatar());
        temp.setEmail(user.getEmail());
        temp.setPhone(user.getPhone());
        return temp;
    }

}
