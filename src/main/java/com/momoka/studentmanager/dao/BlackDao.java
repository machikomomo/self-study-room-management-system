package com.momoka.studentmanager.dao;


import com.momoka.studentmanager.pojo.Black;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//根据Mapper中的代理，为接口生成实现类
public interface BlackDao {
    //全查学生信息
    public List<Black> selectAll();
    //根据ID删除学生信息
    public void deleteById(Integer id);
    //添加学生信息
    public void insertBlack(Black black);

}
