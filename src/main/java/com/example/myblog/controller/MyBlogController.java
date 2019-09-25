package com.example.myblog.controller;


import com.example.myblog.vo.MyBlogRequestVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBlogController {
    @RequestMapping(value = "/myblog/addblog", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object register(@RequestBody MyBlogRequestVo myBlogRequestVo) {
        return myBlogRequestVo;
    }

}
