package com.example.myblog.vo;

import lombok.Data;

import java.util.Date;

@Data
public class BlogAddRequestVo {
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
