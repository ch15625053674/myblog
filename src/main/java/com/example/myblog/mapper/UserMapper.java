package com.example.myblog.mapper;

import com.example.myblog.bean.BlogUser;
import com.example.myblog.vo.LoginRequestVo;
import com.example.myblog.vo.UserRegisterRequestVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into bloguser (login_name,user_name,password,email,create_date,create_by)" +
            "VALUES(#{loginName},#{userName},#{password},#{email},#{createDate},#{createBy});")
    @Options(keyProperty="id",keyColumn="id",useGeneratedKeys=true)
    public int userRegister(UserRegisterRequestVo registerRequestVo);

    @Select("select id,login_name,user_name,password,email,create_date,create_by from bloguser where login_name = #{loginName};")
    public BlogUser findUserByLoginName(LoginRequestVo loginRequestVo);
}
