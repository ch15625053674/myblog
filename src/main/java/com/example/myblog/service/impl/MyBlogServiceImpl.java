package com.example.myblog.service.impl;

import com.example.myblog.bean.BlogUser;
import com.example.myblog.bean.MyblogContent;
import com.example.myblog.commont.MyBlogConstant;
import com.example.myblog.commont.MyblogConvert;
import com.example.myblog.mapper.MyBlogcontentMapper;
import com.example.myblog.service.MyBlogService;
import com.example.myblog.service.UserService;
import com.example.myblog.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MyBlogServiceImpl implements MyBlogService {

    @Autowired
    private MyBlogcontentMapper blogcontentMapper;

    @Override
    public ResponseMsg addBlog(BlogAddRequestVo blogAddRequestVo){
        try {
            blogAddRequestVo.setCreateDate(new Date());
            blogAddRequestVo.setAuthor("");
            if(blogcontentMapper.blogAdd(blogAddRequestVo)!=null && blogcontentMapper.blogAdd(blogAddRequestVo)!=0){
                return MyblogConvert.getReponse(MyBlogConstant.FALSE,null,MyBlogConstant.USER_REGISTER_FAIL,MyBlogConstant.USER_REGISTER_FAIL);
            }
            return MyblogConvert.getReponse(MyBlogConstant.TRUE,null,MyBlogConstant.USER_REGISTER_SUCCESS,MyBlogConstant.USER_REGISTER_SUCCESS);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            return MyblogConvert.getReponse(MyBlogConstant.FALSE,null,MyBlogConstant.USER_REGISTER_FAIL,MyBlogConstant.USER_REGISTER_SUCCESS);
        }
    }


    @Override
    public ResponseMsg showBlog(){
        try {
            List<MyblogContent> list = blogcontentMapper.showBlog();
            if(list==null){
                return MyblogConvert.getReponse(MyBlogConstant.FALSE,null,MyBlogConstant.USER_REGISTER_FAIL,MyBlogConstant.USER_REGISTER_FAIL);
            }
            return MyblogConvert.getReponse(MyBlogConstant.TRUE,list,MyBlogConstant.USER_REGISTER_SUCCESS,MyBlogConstant.USER_REGISTER_SUCCESS);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            return MyblogConvert.getReponse(MyBlogConstant.FALSE,null,MyBlogConstant.USER_REGISTER_FAIL,MyBlogConstant.USER_REGISTER_SUCCESS);
        }
    }


}
