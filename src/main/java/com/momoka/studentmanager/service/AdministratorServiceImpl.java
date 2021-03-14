package com.momoka.studentmanager.service;

import com.momoka.studentmanager.dao.AdministratorDao;
import com.momoka.studentmanager.pojo.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorDao ad;
    @Override
    public Administrator queryByUsername(String username) {
        return ad.selectByUsername(username);
    }
}
