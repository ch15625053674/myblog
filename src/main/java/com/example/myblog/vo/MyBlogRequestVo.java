package com.example.myblog.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class MyBlogRequestVo implements Serializable {
    /**
     *
     */
    private String title;
    private String content;
    private String [] categories;
    private String author;
}
