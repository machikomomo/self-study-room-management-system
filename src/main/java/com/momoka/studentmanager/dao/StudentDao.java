package com.momoka.studentmanager.dao;


import com.momoka.studentmanager.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    //全查学生信息
    public List<Student> selectAll();
    //根据ID删除学生信息
    public void deleteById(Integer id);
    //添加学生信息
    public void insertStudent(Student student);
    //根据ID查询学生信息
    public Student selectById(Integer id);
    //修改学生信息
    public void updateStudent(Student student);
}
