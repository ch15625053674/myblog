package com.example.myblog.bean;

import lombok.Data;

import java.util.Date;

@Data
public class BlogUser {
    private String loginName;
    private String userName;
    private String password;
    private String email;
    private Date createDate;
    private String createBy;

}
