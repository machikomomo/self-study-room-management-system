package com.momoka.studentmanager.dao;


import com.momoka.studentmanager.pojo.Keeper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeeperDao {
    public List<Keeper> selectKeeper();
    public void deleteById(Integer id);
    public void insertKeeper(Keeper keeper);
    public Keeper selectById(Integer id);
    public void updateKeeper(Keeper keeper);
}
