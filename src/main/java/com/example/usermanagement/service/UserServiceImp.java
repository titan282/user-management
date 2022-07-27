package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.exception.UserNotFoundException;
import com.example.usermanagement.model.dto.UserDto;
import com.example.usermanagement.model.mapper.UserMapper;
import com.example.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements  UserService{
//    private static ArrayList<User> users = new ArrayList<User>();

//    static {
//        users.add(new User(0,"Nguyen Cong A","one@gmail.com","012","img","123"));
//        users.add(new User(1,"Nguyen Cong B","one@gmail.com","012","img","123"));
//        users.add(new User(2,"Nguyen Cong C","one@gmail.com","012","img","123"));
//        users.add(new User(3,"Nguyen Cong D","one@gmail.com","012","img","123"));
//        users.add(new User(4,"Nguyen Cong E","one@gmail.com","012","img","123"));
//    }

    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserDto> getListUser() {

        List<UserDto> result = new ArrayList<UserDto>();
        List<User> users = userRepository.findAll();
        for(User user : users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        UserDto result = new UserDto();
        List<User> users = userRepository.findAll();
        for(User user:users) {
            if (user.getId() == id){
                return UserMapper.toUserDto(user);
            }
        }
        throw new UserNotFoundException("User Not Found");
    }

    @Override
    public List<UserDto> searchUserByParam(String name) {
        List<UserDto> result = new ArrayList<UserDto>();
        List<User> users = userRepository.findAll();
        for(User user:users){
            if(user.getName().contains(name)){
                   result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(long id, User user) {
        User user1 = userRepository.getById(id);
        user1.setAvatar(user.getAvatar());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        user1.setName(user.getName());
        user1.setPhone(user.getPhone());
        return userRepository.save(user1);
    }

    @Override
    public boolean deleteUser(long id) {
        User user1 = userRepository.getById(id);
        if(user1!=null){
            userRepository.delete(user1);
            return true;
        }
        return false;
    }


}
