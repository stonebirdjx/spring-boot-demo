package com.example.spring_boot_demo.service;

import com.example.spring_boot_demo.entity.MybatisTest;

public interface MybatisTestService {

    public MybatisTest queryById(int id);
    public int insert(MybatisTest mybatisTest);
}