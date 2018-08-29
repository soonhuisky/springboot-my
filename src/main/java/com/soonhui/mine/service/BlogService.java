package com.soonhui.mine.service;

import com.soonhui.mine.bean.Blog;

import java.util.List;


public interface BlogService {
    Blog getBlogById(int id);
    Blog getBlogByTitle(String title);
    List<Blog> getAllBlogs();
    void deleteBlogById(int id);
    void insertBlog(Blog blog);
    void updateBlog(Blog blog);
}
