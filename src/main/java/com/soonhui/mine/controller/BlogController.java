package com.soonhui.mine.controller;

import com.soonhui.mine.bean.Blog;
import com.soonhui.mine.bean.User;
import com.soonhui.mine.service.BlogService;
import com.soonhui.mine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private UserService userService;

    // 查看所有博文
    @RequestMapping(value = "/blogs", method = RequestMethod.GET)
    public List<Blog> showBlogs(ModelMap modelMap) {
        List<Blog> blogList = blogService.getAllBlogs();
        return blogList;
    }

    @RequestMapping(value = "/blogs/add/", method = RequestMethod.POST)
    public Blog addBlog(@PathParam("titleA") String titleA,
                        @PathParam("content") String content) {
        Blog blog = new Blog();
        blog.setTitle(titleA);
        blog.setContent(content);
        blog.setPubDate(new Date());
        blog.setViews(0);
        blog.setLikes(0);
        blogService.insertBlog(blog);
        return blog;
    }

    @RequestMapping(value = "/blogs/delete/", method = RequestMethod.POST)
    public String deleteBlog(@PathParam("title") String title){
        //PathParam也可以不加
        int id = blogService.getBlogByTitle(title).getId();
        blogService.deleteBlogById(id);
        return "删除成功";
    }

}
