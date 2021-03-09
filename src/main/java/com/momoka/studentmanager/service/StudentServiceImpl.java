package com.momoka.studentmanager.service;

import com.momoka.studentmanager.dao.StudentDao;
import com.momoka.studentmanager.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao sd;
    @Override
    public List<Student> queryAll() {
        return sd.selectAll();
    }

    @Override
    public void removeById(Integer id) {
        try {
            sd.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("根据ID删除有异常");
        }
    }

    @Override
    public void addStudent(Student student) {
        try {
            sd.insertStudent(student);
        }catch (Exception e){
            throw new RuntimeException("添加有异常");
        }
    }

    @Override
    public Student queryById(Integer id) {
        return sd.selectById(id);
    }

    @Override
    public void changeStudent(Student student) {
        try {
            sd.updateStudent(student);
        }catch (Exception e){
            throw new RuntimeException("修改数据异常");
        }
    }
}
