package com.example.myblog.service.impl;

import com.example.myblog.bean.BlogUser;
import com.example.myblog.bean.MyblogContent;
import com.example.myblog.commont.MyBlogConstant;
import com.example.myblog.commont.MyblogConvert;
import com.example.myblog.mapper.UserMapper;
import com.example.myblog.service.UserService;
import com.example.myblog.vo.LoginRequestVo;
import com.example.myblog.vo.ResponseMsg;
import com.example.myblog.vo.UserRegisterRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseMsg userRegister(UserRegisterRequestVo registerRequestVo) {
        registerRequestVo.setCreateBy(MyBlogConstant.REQUEST_SYSTEM);
        registerRequestVo.setCreateDate(new Date());
//        final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        registerRequestVo.setPassword(passwordEncoder.encode(registerRequestVo.getPassword()));
        try {

            if(userMapper.userRegister(registerRequestVo)!=1){
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
    public ResponseMsg login(LoginRequestVo loginRequestVo) {
        BlogUser blogUser = userMapper.findUserByLoginName(loginRequestVo);
        if(blogUser==null){
            return MyblogConvert.getReponse(MyBlogConstant.FALSE,null,MyBlogConstant.LOGIN_FAIL,MyBlogConstant.LOGIN_FAIL);
        }

//        if(!BCrypt.checkpw(loginRequestVo.getPassword(),blogUser.getPassword())){
//            return MyblogConvert.getReponse(null,MyBlogConstant.LOGIN_FAIL,MyBlogConstant.LOGIN_FAIL);
//        }

        if(!blogUser.getPassword().equals(loginRequestVo.getPassword())){
            return MyblogConvert.getReponse(MyBlogConstant.FALSE,null,MyBlogConstant.LOGIN_FAIL,MyBlogConstant.LOGIN_FAIL);
        }
        return MyblogConvert.getReponse(MyBlogConstant.TRUE,blogUser,MyBlogConstant.SUCCESS,MyBlogConstant.LOGIN_SUCCESS);
    }
}
