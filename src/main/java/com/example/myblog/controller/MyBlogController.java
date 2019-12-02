package com.example.myblog.controller;


import com.example.myblog.service.MyBlogService;
import com.example.myblog.vo.BlogAddRequestVo;
import com.example.myblog.vo.MyBlogRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyBlogController {
    @Autowired
    private MyBlogService myBlogService;

    @RequestMapping(value = "/myblog/addblog", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object addblog(@RequestBody BlogAddRequestVo blogAddRequestVo) {
        ResponseEntity responseEntity = new ResponseEntity( myBlogService.addBlog(blogAddRequestVo), HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping(value = "/myblog/showblog", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object showblog(@RequestBody MyBlogRequestVo myBlogRequestVo) {
        ResponseEntity responseEntity = new ResponseEntity( myBlogService.showBlog(), HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(value = "/myblog/blogdetail", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public MyBlogRequestVo blogDetail(@RequestBody MyBlogRequestVo myBlogRequestVo) {
        String [] array = {"1","2","3"};
        MyBlogRequestVo myBlogRequestVo1 = new MyBlogRequestVo();
        myBlogRequestVo1.setAuthor("aaa");
        myBlogRequestVo1.setCategories(array);
        myBlogRequestVo1.setContent("ggggsdgsaaafadfsdf");
        myBlogRequestVo1.setTitle("asd");
        return myBlogRequestVo1;
    }
}
