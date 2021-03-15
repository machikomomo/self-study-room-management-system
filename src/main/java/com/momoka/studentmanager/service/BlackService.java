package com.momoka.studentmanager.service;

import com.momoka.studentmanager.pojo.Black;

import java.util.List;

public interface BlackService {
    //全查学生信息
    public List<Black> queryAll();
    //根据ID删除学生信息
    public void removeById(Integer id);
    //添加学生信息
    public void addBlack(Black black);
}
