package com.example.myblog.mapper;

import com.example.myblog.vo.BlogAddRequestVo;
import com.example.myblog.vo.UserRegisterRequestVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Blogcontent {

    @Select("insert into blogcontent(title,content,author,type,create_date,create_by,update_date,update_by)" +
            "VALUES(#{title},#{content},#{author},#{type},#{createDate},#{createBy},#{updateDate},#{updateBy});")
    @Options(keyProperty="id",keyColumn="id",useGeneratedKeys=true)
    public int blogAdd(BlogAddRequestVo blogAddRequestVo);

}
