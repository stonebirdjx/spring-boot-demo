package com.example.spring_boot_demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InstanceDaoImpl implements InstanceDao {
    
    @Override
    public String get() {
        return "instance-data-001";
    }
    
}
