package com.example.myblog.service;

import com.example.myblog.vo.LoginRequestVo;
import com.example.myblog.vo.ResponseMsg;
import com.example.myblog.vo.UserRegisterRequestVo;

public interface UserService {
    /**
     * 注册账号
     * @param registerRequestVo
     * @return
     */
    public ResponseMsg userRegister(UserRegisterRequestVo registerRequestVo);

    public ResponseMsg login(LoginRequestVo loginRequestVo);
}
