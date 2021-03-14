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

    @RequestMapping("dologin")
    public String match(Administrator administrator){
        Administrator res = as.queryByUsername(administrator.getUsername());
        if(res!=null){
            if(res.getPassword().equals(administrator.getPassword())){
                return "redirect:/student/queryAll";
            }
        }
        return "error";
    }
}
