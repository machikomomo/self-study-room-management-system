package com.momoka.studentmanager.controller;

import com.momoka.studentmanager.pojo.Keeper;
import com.momoka.studentmanager.pojo.Student;
import com.momoka.studentmanager.service.KeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("keeper")
public class KeeperController {
    @Autowired
    private KeeperService ks;

    @RequestMapping("queryAll")
    public String queryAll(Model model) {
        List<Keeper> list = ks.queryAll();
        model.addAttribute("list", list);
        return "showKeeper";
    }

    @RequestMapping("removeById")
    public String removeById(Integer id){
        try {
            ks.removeById(id);
            return "redirect:/keeper/queryAll";
        }catch (Exception e){
            return "error";
        }
    }

    @RequestMapping("add")
    public String add(Model model){
        Keeper keeper = new Keeper();
        model.addAttribute("keeper",keeper);
        return "addKeeper";
    }

    @RequestMapping("addKeeper")
    public String addKeeper(Keeper keeper){
        try {
            ks.addKeeper(keeper);
            return "redirect:/keeper/queryAll";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping("update")
    public String queryById(Integer id, ModelMap mm){
        Keeper keeper = ks.queryById(id);
        mm.addAttribute("keeper",keeper);
        //跳转到修改页面，进行数据的回显
        return "updateKeeper";
    }

    @RequestMapping("changeKeeper")
    public String changeKeeper(Keeper keeper){
        try {
            ks.changeKeeper(keeper);
            return "redirect:/keeper/queryAll";
        }catch (Exception e){
            return "error";
        }
    }
}
