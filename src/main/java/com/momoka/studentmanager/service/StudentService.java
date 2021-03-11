package com.momoka.studentmanager.service;

import com.momoka.studentmanager.pojo.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentService {
    //全查学生信息
    public List<Student> queryAll();
    //根据ID删除学生信息
    public void removeById(Integer id);
    //添加学生信息
    public void addStudent(Student student);
    //根据ID查询学生信息
    public Student queryById(Integer id);
    //修改学生信息
    public void changeStudent(Student student);
}
