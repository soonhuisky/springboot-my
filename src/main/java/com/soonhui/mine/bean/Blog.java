package com.soonhui.mine.bean;

import java.util.Date;

public class Blog {
    private int id;
    private String title;
    private String content;
    private Date pubDate;
    private int views;
    private int likes;
//    private User userById;

//    public User getUserById() {
//        return userById;
//    }
//
//    public void setUserById(User userById) {
//        this.userById = userById;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
