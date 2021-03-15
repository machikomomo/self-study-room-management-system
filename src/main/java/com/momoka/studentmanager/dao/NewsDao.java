package com.momoka.studentmanager.dao;

import com.momoka.studentmanager.pojo.News;
import com.momoka.studentmanager.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
//根据Mapper中的代理，为接口生成实现类
public interface NewsDao {
    public List<News> selectAll();

    public News selectById(Integer id);

}



