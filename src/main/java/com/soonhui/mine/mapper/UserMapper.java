package com.soonhui.mine.mapper;

import com.soonhui.mine.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User getUserById(int id);
    User getUserByUserName(String username);
    List<User> getAllUsers();
    void deleteUserById(int id);
    void insertUser(User user);
    void updateUser(User user);
}
