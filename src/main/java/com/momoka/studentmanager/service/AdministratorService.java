package com.momoka.studentmanager.service;

import com.momoka.studentmanager.pojo.Administrator;

public interface AdministratorService {

    public Administrator queryByUsername(String username);
}
