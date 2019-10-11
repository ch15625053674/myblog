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
	private Date create_date ;
	private String create_by   ;
	private Date update_date ;
	private String update_by   ;
}
