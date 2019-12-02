package com.example.myblog.mapper;

import com.example.myblog.bean.MyblogContent;
import com.example.myblog.vo.BlogAddRequestVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MyBlogcontentMapper {

    @Insert("insert into blogcontent(title,content,author,type,create_date,create_by,update_date,update_by)" +
            "VALUES(#{title},#{content},#{author},#{type},#{createDate},#{createBy},#{updateDate},#{updateBy});")
    @Options(keyProperty="id",keyColumn="id",useGeneratedKeys=true)
    public Integer blogAdd(BlogAddRequestVo blogAddRequestVo);

    @Select("select * from blogcontent;")
    public List<MyblogContent> showBlog();

}
