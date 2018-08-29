package com.soonhui.mine.controller;


import com.soonhui.mine.bean.User;
import com.soonhui.mine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Random;

@RestController
//RestController默认返回的是Json数据，如果加了那返回的就是index
//Controller默认返回的是页面

@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    //查
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        // 查询user表中所有记录
        List<User> userList = userService.getAllUsers();
        return userList;
    }

    //增
    @RequestMapping(value = "/users/add/", method = RequestMethod.POST)
    public User addUser(@PathParam("usernameA") String usernameA,
                        @PathParam("password") String password) {
        User user = new User();
        user.setUserName(usernameA);
        user.setPassword(password);
        user.setVisitors(0);
        user.setScore(0);
        userService.insertUser(user);
        return user;
    }

    //删
    @RequestMapping(value = "/users/delete/", method = RequestMethod.POST)
    public String deleteUser(@PathParam("username") String username) {
        //PathParam也可以不加
        int id = userService.getUserByUserName(username).getId();
        userService.deleteUserById(id);
        return "删除成功";
    }

}
