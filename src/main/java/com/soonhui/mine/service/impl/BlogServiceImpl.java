package com.soonhui.mine.service.impl;

import com.soonhui.mine.bean.Blog;
import com.soonhui.mine.mapper.BlogMapper;
import com.soonhui.mine.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    public Blog getBlogById(int id){ return blogMapper.getBlogById(id); }
    public Blog getBlogByTitle(String title){ return blogMapper.getBlogByTitle(title); }
    public List<Blog> getAllBlogs(){ return blogMapper.getAllBlogs(); }
    public void deleteBlogById(int id){
        blogMapper.deleteBlogById(id);
    }
    public void insertBlog(Blog blog){
        blogMapper.insertBlog(blog);
    }
    public void updateBlog(Blog blog){
        blogMapper.updateBlog(blog);
    }

}
