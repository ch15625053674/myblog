package com.example.myblog.service;

import com.example.myblog.vo.BlogAddRequestVo;
import com.example.myblog.vo.MyBlogRequestVo;
import com.example.myblog.vo.ResponseMsg;

public interface MyBlogService {
    /**
     * 添加博客
     * @param blogAddRequestVo
     * @return
     */
    public ResponseMsg addBlog(BlogAddRequestVo blogAddRequestVo);

    /**
     * 添加博客
     * @param
     * @return
     */
    public ResponseMsg showBlog();
}
