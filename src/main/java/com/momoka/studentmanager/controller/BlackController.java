package com.momoka.studentmanager.controller;


import com.momoka.studentmanager.pojo.Black;
import com.momoka.studentmanager.service.BlackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("black")
public class BlackController {
    // 写法1
    @Autowired
    private BlackService bs;


    //全查
    @RequestMapping("queryAll")
    public String queryAll(Model model){
        List<Black> list =bs.queryAll();
        //存入model中
        model.addAttribute("list",list);
        //控制跳转
        return "showBlack";
    }

    //根据ID删除学生信息
    @RequestMapping("removeById")
    public String removeById(Integer id){
        try {
            bs.removeById(id);
            return "redirect:/black/queryAll";
        }catch (Exception e){
            return "error";
        }
    }

    //添加学生信息
    @RequestMapping("addBlack")
    public String addBlack(Black black){
        try {
            bs.addBlack(black);
            return "redirect:/black/queryAll";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping("add")
    public String add(Model model){
        Black black = new Black();
        model.addAttribute("black",black);
        return "addBlack";
    }


}

