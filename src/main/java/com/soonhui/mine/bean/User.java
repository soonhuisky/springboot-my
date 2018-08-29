package com.soonhui.mine.bean;

import java.util.Collection;
import java.util.List;

public class User {
    private int id;
    private String userName;
    private String password;
    private int visitors;
    private int score;
//    private List<Blog> blogsById;
//
//    public List<Blog> getBlogsById() {
//        return blogsById;
//    }
//
//    public void setBlogsById(List<Blog> blogsById) {
//        this.blogsById = blogsById;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
