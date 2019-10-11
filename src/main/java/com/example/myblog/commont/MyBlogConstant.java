package com.example.myblog.commont;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyBlogConstant {
    /**
     * 隐藏公共构造函数
     */
    private MyBlogConstant() {
        throw new IllegalStateException("MyBlogConstant class");
    }

    /**
     * 请求系统
     */
    public static final String REQUEST_SYSTEM = "MyBlog";

    /**
     * 账户注册失败错误码
     */
    public static final String USER_REGISTER_FAIL = "USER_REGISTER_FAIL";

    /**
     * 账户注册成功响应码
     */
    public static final String USER_REGISTER_SUCCESS = "USER_REGISTER_SUCCESS";

    /**
     * 账户名或密码错误响应码
     */
    public static final String LOGIN_FAIL = "LOGIN_FAIL";

    /**
     * 逻辑处理成功响应码
     */

    public static final String SUCCESS = "SUCCESS";

    /**
     * 登录成功响应码
     */

    public static final String LOGIN_SUCCESS = "LOGIN_SUCCESS";
    /**
     * 业务处理成功
     */

    public static final boolean TRUE = true;

    /**
     * 业务处理失败
     */

    public static final boolean FALSE = false;
}
