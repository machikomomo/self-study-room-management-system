package com.momoka.studentmanager.service;

import com.momoka.studentmanager.pojo.Keeper;

import java.util.List;

public interface KeeperService {
    public List<Keeper> queryAll();

    public void removeById(Integer id);

    public void addKeeper(Keeper keeper);

    public Keeper queryById(Integer id);

    public void changeKeeper(Keeper keeper);
}
