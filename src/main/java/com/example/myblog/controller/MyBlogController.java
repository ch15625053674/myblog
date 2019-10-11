package com.example.myblog.controller;


import com.example.myblog.vo.MyBlogRequestVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyBlogController {
    @RequestMapping(value = "/myblog/addblog", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object addblog(@RequestBody MyBlogRequestVo myBlogRequestVo) {
        return myBlogRequestVo;
    }


    @RequestMapping(value = "/myblog/showblog", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Object> showblog(@RequestBody MyBlogRequestVo myBlogRequestVo) {
        List list = new ArrayList();
        String [] array = {"1","2","3"};
        myBlogRequestVo.setAuthor("aaa");
        myBlogRequestVo.setId(1);
        myBlogRequestVo.setCategories(array);
        myBlogRequestVo.setContent("ggggsdgsaaafadfsdf");
        myBlogRequestVo.setTitle("asd");
        list.add(myBlogRequestVo);
        MyBlogRequestVo myBlogRequestVo1 = new MyBlogRequestVo();
        myBlogRequestVo1.setId(2);
        myBlogRequestVo1.setAuthor("aaa");
        myBlogRequestVo1.setCategories(array);
        myBlogRequestVo1.setContent("ggggsdgsaaafadfsdf");
        myBlogRequestVo1.setTitle("asd");
        list.add(myBlogRequestVo1);
        return list;
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
