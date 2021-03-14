package com.momoka.studentmanager.dao;

import com.momoka.studentmanager.pojo.Administrator;
import com.momoka.studentmanager.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdministratorDao {
    public Administrator selectByUsername(String username);

}
