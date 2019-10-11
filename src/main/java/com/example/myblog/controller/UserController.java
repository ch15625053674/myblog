package com.example.myblog.controller;


import com.example.myblog.service.UserService;
import com.example.myblog.vo.LoginRequestVo;
import com.example.myblog.vo.UserRegisterRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addblog(@RequestBody UserRegisterRequestVo userRegisterRequestVo) {
        ResponseEntity responseEntity = new ResponseEntity( userService.userRegister(userRegisterRequestVo),HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addblog(@RequestBody LoginRequestVo loginRequestVo) {
        ResponseEntity responseEntity = new ResponseEntity( userService.login(loginRequestVo),HttpStatus.OK);
        return responseEntity;
    }

}
