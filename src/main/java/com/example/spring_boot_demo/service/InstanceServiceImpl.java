package com.example.spring_boot_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_demo.dao.InstanceDao;

@Service
public class InstanceServiceImpl implements InstanceService {
    @Autowired
    private InstanceDao instanceDao;
    @Override
    public String get() {
        return instanceDao.get();
    }
    
}
