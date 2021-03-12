package com.momoka.studentmanager.controller;

import com.momoka.studentmanager.pojo.Student;
import com.momoka.studentmanager.service.StudentService;
import com.momoka.studentmanager.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    // 写法1
    @Autowired
    private StudentService ss;

    //全查
    @RequestMapping("queryAll")
    public String queryAll(Model model){
        List<Student> list =ss.queryAll();
        //存入model中
        model.addAttribute("list",list);
        //控制跳转
        return "showAll";
    }

    //根据ID删除学生信息
    @RequestMapping("removeById")
    public String removeById(Integer id){
        try {
            ss.removeById(id);
            return "redirect:/student/queryAll";
        }catch (Exception e){
            return "error";
        }
    }

    //添加学生信息
    @RequestMapping("addStudent")
    public String addStudent(Student student){
        try {
            ss.addStudent(student);
            return "redirect:/student/queryAll";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping("add")
    public String add(){
        return "add";
    }

    //根据ID查询学生信息
    @RequestMapping("queryById")
    public String queryById(Integer id, ModelMap mm){
        Student student = ss.queryById(id);
        mm.addAttribute("student",student);
        //跳转到修改页面，进行数据的回显
        return "update";
    }

    //数据修改
    @RequestMapping("changeStudent")
    public String changeStudent(Student student){
        try {
            ss.changeStudent(student);
            return "redirect:/student/queryAll";
        }catch (Exception e){
            return "error";
        }
    }
}
