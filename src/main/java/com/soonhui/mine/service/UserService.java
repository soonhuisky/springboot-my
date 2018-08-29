package com.soonhui.mine.service;

import com.soonhui.mine.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User getUserById(int id);
    User getUserByUserName(String username);
    List<User> getAllUsers();
    void deleteUserById(int id);
    void insertUser(User user);
    void updateUser(User user);
}
