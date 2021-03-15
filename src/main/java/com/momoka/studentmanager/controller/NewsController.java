package com.momoka.studentmanager.controller;


import com.momoka.studentmanager.pojo.News;
import com.momoka.studentmanager.pojo.Student;
import com.momoka.studentmanager.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService ns;

    @RequestMapping("queryAll")
    public String queryAll(Model model){
        List<News> list =ns.queryAll();
        model.addAttribute("list",list);
        return "showNews";
    }

    @RequestMapping("text")
    public String getText(Integer id, ModelMap model){
        News news = ns.queryById(id);
        news.setContent(news.getContent().replace("\n", "<br />"));
        model.addAttribute("news",news);
        //跳转到修改页面，进行数据的回显
        return "text";
    }

}
