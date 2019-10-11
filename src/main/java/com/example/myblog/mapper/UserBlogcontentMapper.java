package com.example.myblog.mapper;

import com.example.myblog.bean.UserBlogcontent;
import com.example.myblog.vo.BlogAddRequestVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserBlogcontentMapper {

    @Select("insert into bloguser_blogcontent(content_id,bloguser_id)" +
            "values(#{contentId},#{bloguserId});")
    @Options(keyProperty="id",keyColumn="id",useGeneratedKeys=true)
    public int userToBlog(UserBlogcontent userBlogcontent);
}
