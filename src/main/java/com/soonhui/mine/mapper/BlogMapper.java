package com.soonhui.mine.mapper;

import com.soonhui.mine.bean.Blog;
import com.soonhui.mine.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogMapper {
    Blog getBlogById(int id);
    Blog getBlogByTitle(String name);
    List<Blog> getAllBlogs();
    void deleteBlogById(int id);
    void insertBlog(Blog user);
    void updateBlog(Blog user);
}
