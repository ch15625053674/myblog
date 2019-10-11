package com.example.myblog.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserRegisterRequestVo {
    private String loginName;
    private String userName;
    private String password;
    private String email;
    private Date createDate;
    private String createBy;

}
