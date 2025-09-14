package com.example.spring_boot_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_demo.entity.MybatisTest;
import com.example.spring_boot_demo.mapper.MybatisTestMapper;

@Service
public class MybatisTestServiceImpl implements MybatisTestService {
    @Autowired
    private MybatisTestMapper mybatisTestMapper;
    @Override
    public MybatisTest queryById(int id) {
        return mybatisTestMapper.queryById(id);
    }
    
    @Override
    public int insert(MybatisTest mybatisTest) {
        return mybatisTestMapper.insert(mybatisTest);
    }
}
