package com.momoka.studentmanager.service;

import com.momoka.studentmanager.dao.NewsDao;
import com.momoka.studentmanager.pojo.News;
import com.momoka.studentmanager.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao nd;

    @Override
    public List<News> queryAll() {
        return nd.selectAll();
    }

    @Override
    public News queryById(Integer id) {
        return nd.selectById(id);
    }
}
