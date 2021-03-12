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
    // 事务 （全部成功，或者全部失败）
    public void addStudent(Student student) {
        try {
            if(student.getAge() < 18) {
                throw new RuntimeException("添加有异常");
            }
            // 1. china student
            sd.insertStudent(student);
//
//            // 2. japan student
//            sd.insertStudent(student1);

            //  a-> b zhuan 100
            // 1. a -= 100
            // 2. b += 100

        }catch (Exception e){
            e.printStackTrace();
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
