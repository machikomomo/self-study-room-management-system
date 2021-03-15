package com.momoka.studentmanager.service;

import com.momoka.studentmanager.dao.NewsDao;
import com.momoka.studentmanager.pojo.News;
import com.momoka.studentmanager.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface NewsService {
    public List<News> queryAll();
    public News queryById(Integer id);

}
