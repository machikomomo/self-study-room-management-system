package com.momoka.studentmanager.service;

import com.momoka.studentmanager.dao.KeeperDao;
import com.momoka.studentmanager.pojo.Keeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KeeperServiceImpl implements KeeperService {
    @Autowired
    private KeeperDao kd;

    @Override
    public List<Keeper> queryAll() {
        return kd.selectKeeper();
    }

    @Override
    public void removeById(Integer id) {
        try {
            kd.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("根据ID删除有异常");
        }
    }

    @Override
    public void addKeeper(Keeper keeper) {
        try {
            kd.insertKeeper(keeper);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("添加有异常");
        }
    }

    @Override
    public Keeper queryById(Integer id) {
        return kd.selectById(id);
    }

    @Override
    public void changeKeeper(Keeper keeper) {
        try {
            kd.updateKeeper(keeper);
        }catch (Exception e){
            throw new RuntimeException("修改数据异常");
        }
    }
}
