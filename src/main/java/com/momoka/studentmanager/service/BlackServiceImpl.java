package com.momoka.studentmanager.service;

import com.momoka.studentmanager.dao.BlackDao;
import com.momoka.studentmanager.pojo.Black;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlackServiceImpl implements BlackService {

    @Autowired
    private BlackDao bd;

    @Override
    public List<Black> queryAll() {
        return bd.selectAll();
    }

    @Override
    public void removeById(Integer id) {
        try {
            bd.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("根据ID删除有异常");
        }
    }

    @Override
    public void addBlack(Black black) {
        try {
            bd.insertBlack(black);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("添加有异常");
        }
    }
}
