package com.example.myblog.bean;

import lombok.Data;

import java.util.Date;

@Data
public class MyblogContent {
    private int id          ;
    private String title       ;
    private String content     ;
    private String author      ;
    private String type        ;
    private Date createDate ;
    private String createBy   ;
    private Date updateDate ;
    private String updateBy   ;
}
