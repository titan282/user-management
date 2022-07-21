package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.model.dto.UserDto;
import com.example.usermanagement.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements  UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,"Nguyen Cong A","one@gmail.com","012","img","123"));
        users.add(new User(2,"Nguyen Cong B","one@gmail.com","012","img","123"));
        users.add(new User(3,"Nguyen Cong C","one@gmail.com","012","img","123"));
        users.add(new User(4,"Nguyen Cong D","one@gmail.com","012","img","123"));
        users.add(new User(4,"Nguyen Cong E","one@gmail.com","012","img","123"));

    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for(User user : users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }
}
