package com.momoka.studentmanager.controller;

import com.momoka.studentmanager.pojo.Administrator;
import com.momoka.studentmanager.pojo.Student;
import com.momoka.studentmanager.service.AdministratorService;
import com.momoka.studentmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class AdministratorController {
    @Autowired
    private AdministratorService as;

    @RequestMapping("login")
    public String add(Model model){
        Administrator administrator = new Administrator();
        model.addAttribute("administrator",administrator);
        return "login";
    }

//    @RequestMapping("dologin")
//    public String match(Administrator administrator){//括弧里的为前端传回的对象
//        Administrator res = as.queryByUsername(administrator.getUsername());
//        //依照前端返回的对象，获得的username，依照username去执行queryByUsername，能从后端取得一个对象
//        //如果能够取到，就比较两者的密码是否相同，如果相同，就转入首页
//        if(res!=null){
//            if(res.getPassword().equals(administrator.getPassword())){
//                return "redirect:/student/welcome";
//            }
//        }
//        return "error";
//    }
}
