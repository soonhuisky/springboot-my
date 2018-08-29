package com.soonhui.mine.service.impl;

import com.soonhui.mine.bean.User;
import com.soonhui.mine.mapper.UserMapper;
import com.soonhui.mine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
    public User getUserByUserName(String username){
        return userMapper.getUserByUserName(username);
    }
    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }
    public void deleteUserById(int id){
        userMapper.deleteUserById(id);
    }
    public void insertUser(User user){ userMapper.insertUser(user); }
    public void updateUser(User user){ userMapper.updateUser(user); }
}
